import org.w3c.dom.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;
import javax.xml.parsers.*;
import java.io.FileInputStream;
import org.antlr.v4.runtime.*;




public class EvalVisitor extends x_path_grammarBaseVisitor<ArrayList<Node>>{

    private Stack<ArrayList<Node>> stack;
    private Stack<Context> ctxStack;
    private Stack<ArrayList<Context>> ctxListStack;
    private Stack<ArrayList<String>> stackDummy;
    private Document tree;
    //optimzation
    private HashMap<String,GraphNode> graph;
    private HashMap<Integer,TableNode> info;
    private int tablecount;
    private String curr_var;
    //private HashMap<String,DomTree> treemap;

    public EvalVisitor(){
        super();
        stack=new Stack<ArrayList<Node>>();
        ctxStack=new Stack<Context>();
        ctxListStack=new Stack<ArrayList<Context>>();
        stackDummy = new Stack<ArrayList<String>>();
	 //treemap=new HashMap<String,DomTree>();
        //tree=null;
        //this.tree=tree;
        graph=new HashMap<String,GraphNode>();
        info=new HashMap<Integer,TableNode>();
        tablecount=0;
        curr_var="";
    }

    private ArrayList<Node> descOrSelf(Node n){
        ArrayList<Node> nodes = new ArrayList<Node>();
        //putting all nodes in a single array list in document order and then
        Stack <Node> sdfs = new Stack <Node>();
        sdfs.push(n);
        // Perform DFS - Center, Left, Right order.
        while (!sdfs.isEmpty()) {
          Node node = sdfs.pop();
          // Add this node to be visited.
          nodes.add(node);
          //System.out.println ("Adding node during dfs: %s");
          // Add all the children of this node to the DFS stack so that they can be added for visiting
          NodeList children = node.getChildNodes();
          for (int i = children.getLength() - 1; i >=0 ; i--) {
            sdfs.push(children.item(i));
          }
        }

        return nodes;
    }
    //Absolute
    //document("filename")/rp
    @Override
    public ArrayList<Node> visitApSlash(x_path_grammarParser.ApSlashContext ctx){
        String filename=ctx.tag.getText();
       //if (tree==null || (treemap.get(filename)==null)){
            try{
                Document newdoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(filename));
                tree=newdoc;
                ArrayList<Node> root=new ArrayList<Node>();
                root.add(tree.getDocumentElement().getParentNode());
                stack.push(root);
            }catch (Exception e){
                e.printStackTrace();
            }
            //treemap.put(filename,newtree);
            //tree=newtree;
       //}
       //else{
            //tree=treemap.get(filename);
       //}

        //System.out.println("APSlash");
        return visit(ctx.rp());
    }

    //document("filename")//rp
    @Override
    public ArrayList<Node> visitApDeep(x_path_grammarParser.ApDeepContext ctx){
        //System.out.println("APDeep");
        String filename=ctx.tag.getText();
       //if (tree==null || (treemap.get(filename)==null)){
            try{
                Document newdoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(filename));
                tree=newdoc;
                ArrayList<Node> nodes = descOrSelf(tree.getDocumentElement().getParentNode());
                stack.push(nodes);
            }catch (Exception e){
                e.printStackTrace();
            }
       //}
      // else{
            //tree=treemap.get(filename);
       //}
        //}

        //System.out.println(nodes.size());
        //stack.push(nodes);
        return Utils.getUnique(visit(ctx.rp())); //put unique?
    }


    //Relative
    //rp/rp
    @Override
    public ArrayList<Node> visitRpNext(x_path_grammarParser.RpNextContext ctx){
        ArrayList<Node> curr=visit(ctx.left);
        stack.push(curr);
        //System.out.println("RPNext");
        return Utils.getUnique(visit(ctx.right));
    }

    //rp//rp
    @Override
    public ArrayList<Node> visitRpDeep(x_path_grammarParser.RpDeepContext ctx){
        ArrayList<Node> curr=visit(ctx.left);
        ArrayList<Node> result=new ArrayList<Node>();
        for(int i=0;i<curr.size();i++){
            ArrayList<Node> nodes = descOrSelf(curr.get(i));
            stack.push(nodes);
            result.addAll(visit(ctx.right));
        }

        return Utils.getUnique(result);
    }

    //.
    @Override
    public ArrayList<Node> visitRpCurrent(x_path_grammarParser.RpCurrentContext ctx){
        ArrayList<Node> curr=stack.pop();
        return curr;
    }

    //..
    @Override
    public ArrayList<Node> visitRpParent(x_path_grammarParser.RpParentContext ctx){
        ArrayList<Node> curr=stack.pop();
        ArrayList<Node> result=new ArrayList<Node>();
        for(int i=0;i<curr.size();i++){

            result.add(curr.get(i).getParentNode());

        }
        return result;
    }

    //text()
    @Override
    public ArrayList<Node> visitRpText(x_path_grammarParser.RpTextContext ctx){
        ArrayList<Node> curr=stack.pop();
        ArrayList<Node> result=new ArrayList<Node>();
        for(int i=0;i<curr.size();i++){
            NodeList list=curr.get(i).getChildNodes();
            for(int j=0; j<list.getLength(); j++){
                Node node = list.item(j);
                if((node instanceof Text)){
                    result.add(node);
                }
            }
        }
        return result;
    }

    //(rp)
    @Override
    public ArrayList<Node> visitRpPlain(x_path_grammarParser.RpPlainContext ctx){
        return visit(ctx.rp());
    }

    //rp1,rp2
    @Override
    public ArrayList<Node> visitRpInd(x_path_grammarParser.RpIndContext ctx){
        ArrayList<Node> result=new ArrayList<Node>();
        ArrayList<Node> curr;
        if(!stack.empty()){
            curr=stack.peek();
        }
        else{
            curr=null;
        }
        ArrayList<Node> temp=visit(ctx.left);
        result.addAll(temp);
        if (curr!=null){
            if (stack.empty() || !stack.peek().equals(curr))
                stack.push(curr);
        }
        else{
            if (!stack.empty())
                stack.pop();
        }
        temp=visit(ctx.right);
        result.addAll(temp);
        return result;
    }

    //rp'['f']'
    @Override
    public ArrayList<Node> visitRpCond(x_path_grammarParser.RpCondContext ctx){
        ArrayList<Node> curr=visit(ctx.rp());
        ArrayList<Node> result=new ArrayList<Node>();

        for(int i=0;i<curr.size();i++){
            ArrayList<Node> temp=new ArrayList<Node>();
            temp.add(curr.get(i));
            stack.push(temp);
            if(visit(ctx.f()).size()>0){
                result.add(curr.get(i));
            }
            stack.pop();
        }
        return result;
    }

    //@Attr
    @Override
    public ArrayList<Node> visitRpAttr(x_path_grammarParser.RpAttrContext ctx){
        ArrayList<Node> curr=stack.pop();
        ArrayList<Node> result=new ArrayList<Node>();
        for(int i=0;i<curr.size();i++){
            if (curr.get(i).hasAttributes()){
                Node n=curr.get(i).getAttributes().getNamedItem(ctx.Id().getText());
                if (n!=null){
                    result.add(n);
                }
            }
        }
        return result;
    }



    //*
    @Override
    public ArrayList<Node> visitRpStar(x_path_grammarParser.RpStarContext ctx){
        ArrayList<Node> curr=stack.pop();
        ArrayList<Node> result=new ArrayList<Node>();
        for(int i=0;i<curr.size();i++){
            NodeList list=curr.get(i).getChildNodes();
            for(int j=0; j<list.getLength(); j++){
                Node node = list.item(j);
                if(node instanceof Element){
                    result.add(node);
                }
            }
        }
        return result;
    }

    //tagname
    @Override
    public ArrayList<Node> visitRpTag(x_path_grammarParser.RpTagContext ctx){
        //System.out.println("Tag");
        ArrayList<Node> curr;
        if(!stack.empty())
            curr=stack.pop();
        else{
            curr=new ArrayList<Node>();
            curr.add(tree.getDocumentElement());
        }

        ArrayList<Node> result=new ArrayList<Node>();

        for(int i=0;i<curr.size();i++){
            //System.out.println(curr.get(i).getNodeName());
            NodeList list=curr.get(i).getChildNodes();
            for(int j=0; j<list.getLength(); j++){
                Node node = list.item(j);
                if(node instanceof Element){
                    Element child=(Element)node;
                    if (child.getNodeName().equals(ctx.Id().getText()))
                        //debug
                        //System.out.println(node.getFirstChild().getTextContent());
                        result.add(node);
                }
            }
        }
        //System.out.println("Tag");
        return result;
    }

    //Filter
    //ensure always for a single node
    //rp
    @Override
    public ArrayList<Node> visitFRp(x_path_grammarParser.FRpContext ctx){
        return visit(ctx.rp());
    }

    //(f)
    @Override
    public ArrayList<Node> visitFInd(x_path_grammarParser.FIndContext ctx){
        return visit(ctx.f());
    }

    @Override
    public ArrayList<Node> visitFNot(x_path_grammarParser.FNotContext ctx){
        ArrayList<Node> res=visit(ctx.f());
        if(res.size()>0){
            return (new ArrayList<Node>());
        }
        res.add(tree.getDocumentElement());
        return res;
    }

    @Override
    public ArrayList<Node> visitFOr(x_path_grammarParser.FOrContext ctx){
        ArrayList<Node> curr;
        if(!stack.empty()){
            curr=stack.peek();
        }
        else{
            curr=null;
        }
        ArrayList<Node> f1=visit(ctx.left);
        if (curr!=null){
            if (stack.empty() || !stack.peek().equals(curr))
                stack.push(curr);
        }
        else{
            if (!stack.empty())
                stack.pop();
        }
        ArrayList<Node> f2=visit(ctx.right);
        //stack.push(curr);
        if(f1.size()>0 || f2.size()>0){
            f1.add(tree.getDocumentElement());
            return f1;
        }
        return (new ArrayList<Node>());
    }

    @Override
    public ArrayList<Node> visitFAnd(x_path_grammarParser.FAndContext ctx){
        ArrayList<Node> curr;
        if(!stack.empty()){
            curr=stack.peek();
        }
        else{
            curr=null;
        }
        ArrayList<Node> f1=visit(ctx.left);
        if (curr!=null){
            if (stack.empty() || !stack.peek().equals(curr))
                stack.push(curr);
        }
        else{
            if (!stack.empty())
                stack.pop();
        }
        ArrayList<Node> f2=visit(ctx.right);
        //stack.push(curr);
        if(f1.size()>0 && f2.size()>0){
            f1.add(tree.getDocumentElement());
            return f1;
        }
        return (new ArrayList<Node>());
    }

    @Override
    public ArrayList<Node> visitFIs(x_path_grammarParser.FIsContext ctx){
        ArrayList<Node> curr;
        if(!stack.empty()){
            curr=stack.peek();
        }
        else{
            curr=null;
        }
        ArrayList<Node> f1=visit(ctx.left);
        if (curr!=null){
            if (stack.empty() || !stack.peek().equals(curr))
                stack.push(curr);
        }
        else{
            if (!stack.empty())
                stack.pop();
        }
        ArrayList<Node> f2=visit(ctx.right);
        for(Node n:f1){
            for (Node t:f2){
                if(n.isSameNode(t)){
                    ArrayList<Node> result=new ArrayList<Node>();
                    result.add(t);
                    return result;
                }
            }
        }
        return (new ArrayList<Node>());
    }

    @Override
    public ArrayList<Node> visitFEq(x_path_grammarParser.FEqContext ctx){
        ArrayList<Node> curr;
        if(!stack.empty()){
            curr=stack.peek();
        }
        else{
            curr=null;
        }
        ArrayList<Node> f1=visit(ctx.left);
        if (curr!=null){
            if (stack.empty() || !stack.peek().equals(curr))
                stack.push(curr);
        }
        else{
            if (!stack.empty())
                stack.pop();
        }
        ArrayList<Node> f2=visit(ctx.right);
        for(Node n:f1){
            for (Node t:f2){
                if(n.isEqualNode(t)){
                    ArrayList<Node> result=new ArrayList<Node>();
                    result.add(t);
                    return result;
                }
            }
        }
        return (new ArrayList<Node>());
    }

    //xq
    //var
    @Override
    public ArrayList<Node> visitXVar(x_path_grammarParser.XVarContext ctx){
        Context c;
        if (!ctxStack.empty()){
            c= ctxStack.peek();
        }
        else{
            return (new ArrayList<Node>());
        }
        String s= ctx.var().Id().getText();
        ArrayList<Node> result=c.get(s);
        if (result!=null)
            return result;
        else
            return (new ArrayList<Node>());
    }

    //String_constant
    @Override
    public ArrayList<Node> visitXStr(x_path_grammarParser.XStrContext ctx){
        String s=ctx.String_constant().getText().trim();
        //System.out.println(s);
        ArrayList<Node> result=new ArrayList<Node>();
        try{
            Document newdoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Text t= newdoc.createTextNode(s.substring(1,s.length()-1));
            result.add(t);
            tree=newdoc;
        }catch (Exception ex) {
        ex.printStackTrace();
        }
        return result;
    }

    //(xq)
    @Override
    public ArrayList<Node> visitXPlain(x_path_grammarParser.XPlainContext ctx){
        return visit(ctx.xq());
    }

    //xq,xq
    @Override
    public ArrayList<Node> visitXInd(x_path_grammarParser.XIndContext ctx){
        Context c;
        if(!ctxStack.empty()){
            c= ctxStack.peek();
        }
        else{
            c=null;
        }
        ArrayList<Node> result=new ArrayList<Node>();
        ArrayList<Node> curr;
        if(!stack.empty()){
            curr=stack.peek();
        }
        else{
            curr=null;
        }
        ArrayList<Node> temp=visit(ctx.left);
        result.addAll(temp);
        if (curr!=null){
            if (stack.empty() || !stack.peek().equals(curr))
                stack.push(curr);
        }
        else{
            if (!stack.empty())
                stack.pop();
        }
        if (c!=null){
            if (ctxStack.empty() ||!ctxStack.peek().equals(c))
                ctxStack.push(c);
        }
        else{
            if (!ctxStack.empty())
                ctxStack.pop();
        }
        temp=visit(ctx.right);
        result.addAll(temp);
        return result;
    }

    //xq/rp
    @Override
    public ArrayList<Node> visitXSlash(x_path_grammarParser.XSlashContext ctx){
        ArrayList<Node> curr=visit(ctx.xq());
        stack.push(curr);
        return Utils.getUnique(visit(ctx.rp()));
    }

    //xq//rp
    @Override
    public ArrayList<Node> visitXDeep(x_path_grammarParser.XDeepContext ctx){
        ArrayList<Node> curr=visit(ctx.xq());
        ArrayList<Node> result=new ArrayList<Node>();
        for(int i=0;i<curr.size();i++){
            ArrayList<Node> nodes = descOrSelf(curr.get(i));
            stack.push(nodes);
            result.addAll(visit(ctx.rp()));
        }

        return Utils.getUnique(result);

    }

    //join(xq,xq,list1,list2)
    @Override
    public ArrayList<Node> visitXJoin(x_path_grammarParser.XJoinContext ctx)
    {
	System.out.println("Inside visitJoin");
        ArrayList<Node> result=new ArrayList<Node>();
	ArrayList<Node> xqFirst = visit(ctx.left);
	ArrayList<Node> xqSecond = visit(ctx.right);
	ArrayList<Node> firstGarbage = visit(ctx.leftlist);
	ArrayList<Node> secondGarbage = visit(ctx.rightlist);

	ArrayList<String> secondList = stackDummy.pop();
        ArrayList<String> firstList = stackDummy.pop();
	//Creating a new HashMap
        Map<ArrayList<String>,ArrayList<Node>> hm = new HashMap<ArrayList<String>, ArrayList<Node>>();
        Map<ArrayList<String>,ArrayList<Node>> hmTwo = new HashMap<ArrayList<String>, ArrayList<Node>>();
	// Looping over all the entries in the result of xqFirst
	for(int i=0; i<xqFirst.size();i++){
	    //For every result in xqFirst, create a list of strings which contains joinList values
	    ArrayList<Node> hashMapVal ;
	    ArrayList<String> joinList = new ArrayList<String>();
	    //To retrieve the join attribute values
	    if (xqFirst.get(i)!= null){
                NodeList children = xqFirst.get(i).getChildNodes();
                for (int j = children.getLength() - 1; j >=0 ; j--) {
	            for (int k= 0; k < firstList.size(); k++){
		        //System.out.println("children.getNodeName "+children.item(j).getNodeName());
		        //System.out.println("firstList.get(k) "+firstList.get(k));
	                if (children.item(j)!= null && children.item(j).getNodeName()!= null && children.item(j).getNodeName().equals(firstList.get(k))){
			    //TODO : find if value is always of type string
            		    NodeList grandChildren = children.item(j).getChildNodes();
			    if (grandChildren.getLength() > 0){
            		        NodeList greatGrandChildren = grandChildren.item(0).getChildNodes();
		                //System.out.println("grandchildren.getNodeName" +greatGrandChildren.item(0).getNodeValue());
			    	if (greatGrandChildren.getLength() > 0)
				    if (greatGrandChildren.item(0).getNodeValue()!=null)
		                        joinList.add(greatGrandChildren.item(0).getNodeValue());
			    }
		        }
		    }
	        }
   	    }
	    //System.out.println("Length of joinList" + joinList.size());
	    if (hm.get(joinList)!= null ){
		hashMapVal = hm.get(joinList);
	    }
	    else{
        	hashMapVal = new ArrayList<Node>();
		String str = "";
		for (int u=0; u< joinList.size(); u++){
		    str = str + joinList.get(u);
		}
		//System.out.println("Joinlist in First Query "+str);
	    }
	    hashMapVal.add(xqFirst.get(i));
	    hm.put(joinList, hashMapVal);
	}
	//System.out.println("Total number of nodes in second query "+xqSecond.size());
	for(int i=0; i<xqSecond.size();i++){
	    ArrayList<Node> hashMapVal ;
	    ArrayList<String> joinList = new ArrayList<String>();
	    if (xqSecond.get(i) != null){
                NodeList children = xqSecond.get(i).getChildNodes();
	        //System.out.println("Second query node number "+i+ " length of children "+children.getLength());
                for (int j = children.getLength() - 1; j >=0 ; j--) {
	    	    //System.out.println("query-node-child");
	            for (int k= 0; k < secondList.size(); k++){
		        //System.out.println("children.getNodeName "+children.item(j).getNodeName());
		        //System.out.println("firstList.get(k) "+secondList.get(k));
	                if (children.item(j)!= null && children.item(j).getNodeName()!= null && children.item(j).getNodeName().equals(secondList.get(k))){
            		    NodeList grandChildren = children.item(j).getChildNodes();
			    if (grandChildren.getLength() > 0){
            		    	NodeList greatGrandChildren = grandChildren.item(0).getChildNodes();
		            	//System.out.println("grandchildren.getNodeName" +greatGrandChildren.item(0).getNodeValue());
			    	if (greatGrandChildren.getLength() > 0 )
				    if (greatGrandChildren.item(0).getNodeValue()!=null)
		            	        joinList.add(greatGrandChildren.item(0).getNodeValue());
			    }
		        }
		    }
	        }
	    }
	    if (hmTwo.get(joinList)!= null ){
		hashMapVal = hmTwo.get(joinList);
	    }
	    else{
        	hashMapVal = new ArrayList<Node>();
		String str = "";
		for (int u=0; u< joinList.size(); u++){
		    str = str + joinList.get(u);    		}
		//System.out.println("Joinlist in Second Query "+str);
	    }

	    hashMapVal.add(xqSecond.get(i));
	    hmTwo.put(joinList, hashMapVal);
	}


        for(Map.Entry<ArrayList<String>, ArrayList<Node>> entry : hm.entrySet()){
	    if (hmTwo.get(entry.getKey())!= null) {
		//System.out.println("The entries in hashmaps match");
	    	ArrayList<Node> listOne = entry.getValue();
	    	ArrayList<Node> listTwo = hmTwo.get(entry.getKey());
		for (int a=0; a<listOne.size(); a++){
		    for (int b=0; b<listTwo.size(); b++){
               		try{
			Document newdoc;
            		newdoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                	Element node = newdoc.createElement("tuple");
                	newdoc.appendChild(node);
            		tree=newdoc;
        		NodeList child=listOne.get(a).getChildNodes();
			//System.out.println("Number of children in first query "+child.getLength());
        		for(int j=0;j<child.getLength();j++){
       				if(child.item(j) instanceof Attr){
                			Node x=newdoc.importNode(child.item(j),true);
			    		node.setAttribute(x.getNodeName(),x.getNodeValue());
            			}
				else
					node.appendChild(newdoc.importNode(child.item(j),true));
        		}
        		NodeList childTwo=listTwo.get(b).getChildNodes();
			//System.out.println("Number of children in second query "+childTwo.getLength());
        		for(int j=0;j<childTwo.getLength();j++){
       				if(childTwo.item(j) instanceof Attr){
                			Node x=newdoc.importNode(childTwo.item(j),true);
				    	node.setAttribute(x.getNodeName(),x.getNodeValue());
            			}
				else
					node.appendChild(newdoc.importNode(childTwo.item(j),true));
        		}
			result.add(node);
			NodeList childFinal = node.getChildNodes();
			for (int f=0; f<childFinal.getLength() ; f++){
				//System.out.println("ChildFinal "+childFinal.item(f).getNodeName());
			}
			}catch (Exception ex) {
    	    		ex.printStackTrace();
    			}
		    }
		}
	    }
        }
        return result;
    }

    //making node thing
    @Override
    public ArrayList<Node> visitXNode(x_path_grammarParser.XNodeContext ctx){
        ArrayList<Node> result=new ArrayList<Node>();
        Document newdoc;
        try{
            newdoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element node = newdoc.createElement(ctx.lt.getText());
            newdoc.appendChild(node);
            tree=newdoc;
        ArrayList<Node> children=visit(ctx.xq());
        for(int i=0;i<children.size();i++){
       		if(children.get(i) instanceof Attr){
                Node x=newdoc.importNode(children.get(i),true);
			    node.setAttribute(x.getNodeName(),x.getNodeValue());
            }
		else
			node.appendChild(newdoc.importNode(children.get(i),true));
        }
        result.add(node);
        }catch (Exception ex) {
        ex.printStackTrace();
    }

        return result;


        /*
        int flag=0;
        if (tree==null){
            flag=1;
            DomTree newtree=new DomTree();
            treemap.put("",newtree);
            tree=newtree;
       }

        Element node = tree.self.createElement(ctx.lt.getText());
        if (flag==1){
            tree.self.appendChild(node);
            tree.root=node;
        }*/
        /*
        ArrayList<Node> children=visit(ctx.xq());
        Element node;
        if (children.size()==0){
            DomTree newtree=new DomTree();
            treemap.put("",newtree);
            tree=newtree;
            node = tree.self.createElement(ctx.lt.getText());
            tree.self.appendChild(node);
            tree.root=node;
        }
        else{
            node=children.get(0).getOwnerDocument().createElement(ctx.lt.getText());
        }
        for(int i=0;i<children.size();i++){
            //Node x;
            if (children.get(i).getOwnerDocument()==node.getOwnerDocument()){
                //System.out.println(tree.filename);
                node.appendChild(children.get(i).cloneNode(true));
            }
            else{
                //System.out.println(children.get(i).getOwnerDocument().filename);
                node.appendChild(tree.self.adoptNode(children.get(i).cloneNode(true)));
            }

        }
        result.add(node);
        return result;
        */
    }

    //for..
    @Override
    public ArrayList<Node> visitXState(x_path_grammarParser.XStateContext ctx){
        visit(ctx.forClause());
        ArrayList<Context> ac= ctxListStack.pop();
        ArrayList<Node> result=new ArrayList<Node>();
        //System.out.println("Context size:"+ac.size());
        for (Context c: ac){
            ctxStack.push(c);
            if (ctx.letClause()!=null){
                visit(ctx.letClause());
            }
            if (ctx.whereClause()!=null && visit(ctx.whereClause()).size()>0){
                result.addAll(visit(ctx.returnClause()));
            }
            else if(ctx.whereClause()==null){
                result.addAll(visit(ctx.returnClause()));
            }
            ctxStack.pop();
        }
        //for (Node x:result)
            //System.out.println("Result "+x.getTextContent());
        return result;
    }

    //list
    @Override
    public ArrayList<Node> visitList(x_path_grammarParser.ListContext ctx){
	ArrayList<Node> res= new ArrayList<Node>();
        List<x_path_grammarParser.IdContext> variables=ctx.id();
	ArrayList<String> result= new ArrayList<String>();
	for( int i=0; i<variables.size();i++){
	    //System.out.println(variables.get(i).Id().getText());
	    result.add(variables.get(i).Id().getText());
	}
	//return the list of nodes as form of arraylist of nodes
	stackDummy.push(result);
	return res;
    }

    //for
    @Override
    public ArrayList<Node> visitForClause(x_path_grammarParser.ForClauseContext ctx){
        //System.out.println("in for");
        Context c;
        if(ctxStack.empty()){
            c=new Context();
        }
        else{
            c=new Context(ctxStack.peek());
        }

        ArrayList<Context> clist= new ArrayList<Context>();
        clist.add(c);

        List<x_path_grammarParser.VarContext> variables=ctx.var();
        List<x_path_grammarParser.XqContext> queries=ctx.xq();

        for(int i=0;i<variables.size();i++){
            ArrayList<Context> temp=new ArrayList<Context>();
            for (Context x:clist){
                ctxStack.push(x);
                ArrayList<Node> res=visit(queries.get(i));
                if (res.size()>0){
                    for (Node n:res){
                        Context tc=new Context(x);
                        ArrayList<Node> tres= new ArrayList<Node>();
                        tres.add(n);
                        tc.set(variables.get(i).Id().getText(),tres);
                        temp.add(tc);
                    }
                }
                else{
                    Context tc=new Context(x);
                    ArrayList<Node> tres= new ArrayList<Node>();
                    tc.set(variables.get(i).Id().getText(),tres);
                    temp.add(tc);
                }
                ctxStack.pop();
            }
            clist=temp;
        }

	//return a list of all ID nodes
        ctxListStack.push(clist);
        return null;
    }

    //let
    @Override
    public ArrayList<Node> visitLetClause(x_path_grammarParser.LetClauseContext ctx){
        List<x_path_grammarParser.VarContext> variables=ctx.var();
        List<x_path_grammarParser.XqContext> queries=ctx.xq();
        for(int i=0;i<variables.size();i++){
            ArrayList<Node> res=visit(queries.get(i));
            Context c=ctxStack.pop();
            c.set(variables.get(i).Id().getText(),res);
            ctxStack.push(c);
        }
        return null;
    }


    //xlet
    //letClause xq
    @Override
    public ArrayList<Node> visitXLet(x_path_grammarParser.XLetContext ctx){
        Context c;
        if(ctxStack.empty()){
            c=new Context();
        }
        else{
            c=new Context(ctxStack.peek());
        }

        ctxStack.push(c);
        visit(ctx.letClause());
        ArrayList<Node> result=visit(ctx.xq());
        ctxStack.pop();

        return result;
    }

    //cond
    //some..
    @Override
    public ArrayList<Node> visitCondSome(x_path_grammarParser.CondSomeContext ctx){
        Context c;
        if(ctxStack.empty()){
            c=new Context();
        }
        else{
            c=new Context(ctxStack.peek());
        }
        ctxStack.push(c);
        List<x_path_grammarParser.VarContext> variables=ctx.var();
        List<x_path_grammarParser.XqContext> queries=ctx.xq();
        for(int i=0;i<variables.size();i++){
            ArrayList<Node> res=visit(queries.get(i));
            c=ctxStack.pop();
            c.set(variables.get(i).Id().getText(),res);
            ctxStack.push(c);
        }

        ArrayList<Node> result=visit(ctx.cond());

        ctxStack.pop();
        return result;

    }

    //xq=xq
    //xq eq xq
    @Override
    public ArrayList<Node> visitCondEq(x_path_grammarParser.CondEqContext ctx){
        Context c;
        if(!ctxStack.empty()){
            c= ctxStack.peek();
        }
        else{
            c=null;
        }
        ArrayList<Node> result=new ArrayList<Node>();
        ArrayList<Node> cond1=visit(ctx.left);
        if (c!=null){
            if (ctxStack.empty() ||!ctxStack.peek().equals(c))
                ctxStack.push(c);
        }
        else{
            if (!ctxStack.empty())
                ctxStack.pop();
        }
        ArrayList<Node> cond2=visit(ctx.right);
        for(Node n:cond1){
            for (Node t:cond2){
                if(n.isEqualNode(t)){
                    //System.out.println("Matched");
                    result.add(t);
                    return result;
                }
            }
        }
        return (new ArrayList<Node>());
    }

    //xq is xq
    //xq == xq
    @Override
    public ArrayList<Node> visitCondIs(x_path_grammarParser.CondIsContext ctx){
        Context c;
        if(!ctxStack.empty()){
            c= ctxStack.peek();
        }
        else{
            c=null;
        }
        ArrayList<Node> result=new ArrayList<Node>();
        ArrayList<Node> cond1=visit(ctx.left);
        if (c!=null){
            if (ctxStack.empty() ||!ctxStack.peek().equals(c))
                ctxStack.push(c);
        }
        else{
            if (!ctxStack.empty())
                ctxStack.pop();
        }
        ArrayList<Node> cond2=visit(ctx.right);
        for(Node n:cond1){
            for (Node t:cond2){
                if(n.isSameNode(t)){
                    result.add(t);
                    return result;
                }
            }
        }
        return (new ArrayList<Node>());
    }

    //cond and cond
    @Override
    public ArrayList<Node> visitCondAnd(x_path_grammarParser.CondAndContext ctx){
        Context c;
        if(!ctxStack.empty()){
            c= ctxStack.peek();
        }
        else{
            c=null;
        }
        ArrayList<Node> cond1=visit(ctx.left);
        if (c!=null){
            if (ctxStack.empty() ||!ctxStack.peek().equals(c))
                ctxStack.push(c);
        }
        else{
            if (!ctxStack.empty())
                ctxStack.pop();
        }
        ArrayList<Node> cond2=visit(ctx.right);
        if(cond1.size()>0 && cond2.size()>0){
                cond1.add(tree.getDocumentElement());
                return cond1;
        }
        return (new ArrayList<Node>());
    }

    //cond or cond
    @Override
    public ArrayList<Node> visitCondOr(x_path_grammarParser.CondOrContext ctx){
        Context c;
        if(!ctxStack.empty()){
            c= ctxStack.peek();
        }
        else{
            c=null;
        }
        ArrayList<Node> cond1=visit(ctx.left);
        if (c!=null){
            if (ctxStack.empty() ||!ctxStack.peek().equals(c))
                ctxStack.push(c);
        }
        else{
            if (!ctxStack.empty())
                ctxStack.pop();
        }
        ArrayList<Node> cond2=visit(ctx.right);
        if(cond1.size()>0 || cond2.size()>0){
                cond1.add(tree.getDocumentElement());
                return cond1;
        }
        return (new ArrayList<Node>());
    }

    //not cond
    @Override
    public ArrayList<Node> visitCondNot(x_path_grammarParser.CondNotContext ctx) {
        Context c;
        if(!ctxStack.empty()){
            c= ctxStack.peek();
        }
        else{
            c=null;
        }
        ArrayList<Node> res=visit(ctx.cond());
        if(res.size()>0){
                return (new ArrayList<Node>());
        }
        res.add(tree.getDocumentElement());
        return res;
    }

    //(cond)
    @Override
    public ArrayList<Node> visitCondPlain(x_path_grammarParser.CondPlainContext ctx){
        return visit(ctx.cond());
    }

    //empty(xq)
    @Override
    public ArrayList<Node> visitCondEmp(x_path_grammarParser.CondEmpContext ctx){
        Context c;
        if(!ctxStack.empty()){
            c= ctxStack.peek();
        }
        else{
            c=null;
        }
        ArrayList<Node> res=visit(ctx.xq());
        if(res.size()>0){
                return (new ArrayList<Node>());
        }
        res.add(tree.getDocumentElement());
        return res;
    }

    // where cond
    @Override
    public ArrayList<Node> visitWhereClause(x_path_grammarParser.WhereClauseContext ctx){
        return visit(ctx.cond());
    }

    //return xq
    @Override
    public ArrayList<Node> visitReturnClause(x_path_grammarParser.ReturnClauseContext ctx){
        return visit(ctx.xq());
    }

    @Override
    public ArrayList<Node> visitRewriteXq(x_path_grammarParser.RewriteXqContext ctx){
        System.out.println("in rewrite");
        visit(ctx.forJ());
        visit(ctx.condJ());
        String returns=ctx.returnJ().getText();
        String sjoin=null;
        LinkedList<Integer> st= new LinkedList<Integer>();
        st.addAll(info.keySet());
        //can manipulate how entries are added to the stack to implement selection pushdown

        while(st.size()>1){

            int curr=st.pop();
            int whom;

                Set<Integer> setc=info.get(curr).join.keySet();
                 if(!setc.isEmpty()){
                    whom=setc.iterator().next();
                    st.remove(new Integer(whom));
                 }
                 else{
                    whom=st.pop();
                 }

                if(sjoin==null){
                    sjoin=Utils.constructJoin(info, curr, whom,null);
                }
                else{
                    sjoin=Utils.constructJoin(info,curr, whom,sjoin);
                }
                //remove join edges
                if(info.get(curr).join.get(whom)!=null)
                    info.get(curr).join.remove(whom);
                if(info.get(whom).join.get(curr)!=null)
                    info.get(whom).join.remove(curr);
                //create new node
                info=Utils.createNode(info,curr,whom);

                //correct edges
                //curr
                int news=(-1*curr*10)+whom;
                Integer[] keys=Arrays.asList(setc.toArray()).toArray(new Integer[setc.toArray().length]);
                for (int k:keys){
                    info.get(k).join.put(news,info.get(k).join.get(curr));
                    info.get(k).join.remove(curr);
                }

                //whom
                Set<Integer> setw=info.get(whom).join.keySet();
                keys=Arrays.asList(setw.toArray()).toArray(new Integer[setw.toArray().length]);
                for (int k:keys){
                    if(info.get(k).join.containsKey(news)){
                        info.get(k).join.get(news).addAll(info.get(k).join.get(whom));
                    }
                    else{
                        info.get(k).join.put(news,info.get(k).join.get(whom));
                    }
                    info.get(k).join.remove(whom);
                }

                //delete old nodes
                info.remove(curr);
                info.remove(whom);
                st.addFirst(news);

        }
        String query;
        if((st.size()==1) && sjoin!=null){
            //replace tokens here
            int n=st.pop();
            String returnStatement=returns.replaceAll("\\$","\\$tuple/");
            query="for $tuple in "+sjoin+Utils.makeWhere(n,info)+" return "+returnStatement;

        }
        else{
            //add dummy let clause to avoid infinite loop
            int n=st.pop();
            query="let $pooja=\"n\" "+ctx.forJ().getText()+Utils.makeWhere(n,info)+" return "+returns;
        }

        //execute query
    System.out.println(query);
    ANTLRInputStream inputq = new ANTLRInputStream(query); //"document(\"j_caesar.xml\")/TITLE");

    // create a lexer that feeds off of input CharStream
    x_path_grammarLexer lexerq = new x_path_grammarLexer(inputq);

    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokensq = new CommonTokenStream(lexerq);

    x_path_grammarParser parserq=new x_path_grammarParser(tokensq);
    ParseTree treeq = parserq.r();


    EvalVisitor evalq = new EvalVisitor();

    ArrayList<Node> result=evalq.visit(treeq);
    if (result==null){
        result=new ArrayList<Node>();
    }
    return result;

    }

    @Override
    public ArrayList<Node> visitJfor(x_path_grammarParser.JforContext ctx) {

        List<x_path_grammarParser.VarContext> variables=ctx.var();
        List<x_path_grammarParser.PathContext> paths=ctx.path();

        for(int i=0;i<variables.size();i++){
            curr_var=variables.get(i).Id().getText();
            visit(paths.get(i));
        }
        return null;
    }



    @Override
    public ArrayList<Node> visitPathAp(x_path_grammarParser.PathApContext ctx){
        tablecount++;
        graph.put(curr_var,new GraphNode(tablecount));
        TableNode t=new TableNode();
        t.fors.put("$"+curr_var,ctx.getText());
        info.put(tablecount,t);
        return null;
    }

    @Override
    public ArrayList<Node> visitPathSlash(x_path_grammarParser.PathSlashContext ctx) {

        String parent=ctx.var().Id().getText();
        int number=graph.get(parent).table;
        GraphNode g=new GraphNode(number);
        g.parent=parent;
        graph.put(curr_var,g);
        graph.get(parent).children.add(curr_var);
        TableNode t=info.get(number);
        t.fors.put("$"+curr_var,ctx.getText());
        return null;

    }

    @Override
    public ArrayList<Node> visitJEq(x_path_grammarParser.JEqContext ctx) {
        String var1=ctx.left.Id().getText();
        String var2=ctx.right.Id().getText();
        int table1=graph.get(var1).table;
        int table2=graph.get(var2).table;
        if (table1==table2){
            ArrayList<String> as=new ArrayList<String>();
            if(info.get(table1).where.get("$"+var1)==null){
                as.add("$"+var2);
                info.get(table1).where.put("$"+var1,as);}
            else
                info.get(table1).where.get("$"+var1).add("$"+var2);
        }
        else{
            ArrayList<String> j=info.get(table1).join.get(table2);
            if (j!=null){
                j.add(var1);
                info.get(table2).join.get(table1).add(var2);
            }
            else{
                info.get(table1).join.put(new Integer(table2),new ArrayList<String>());
                info.get(table1).join.get(table2).add(var1);
                info.get(table2).join.put(new Integer(table1),new ArrayList<String>());
                info.get(table2).join.get(table1).add(var2);
            }
        }
        return null;
    }

    @Override
    public ArrayList<Node> visitJEqS(x_path_grammarParser.JEqSContext ctx) {
        String var1=ctx.lt.Id().getText();
        ArrayList<String> as=new ArrayList<String>();
        if(info.get(graph.get(var1).table).where.get("$"+var1)==null){
            as.add(ctx.rt.getText());
            info.get(graph.get(var1).table).where.put("$"+var1,as);
        }
        else{
            info.get(graph.get(var1).table).where.get("$"+var1).add(ctx.rt.getText());
        }
        return null;
    }

    @Override
    public ArrayList<Node> visitJand(x_path_grammarParser.JandContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        return null;
    }
}
