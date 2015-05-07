import org.w3c.dom.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;


public class EvalVisitor extends x_path_grammarBaseVisitor<ArrayList<Node>>{

    private Stack<ArrayList<Node>> stack;
    //private ArrayList<Node> list;
    private DomTree tree;

    public EvalVisitor(){
        super();
        stack=new Stack<ArrayList<Node>>();
        //list=new ArrayList<Node>();
        //this.tree=tree;
    }

    //Absolute
    //document("filename")/rp
    @Override
    public ArrayList<Node> visitApSlash(x_path_grammarParser.ApSlashContext ctx){
        String filename=ctx.tag.getText();
        tree=new DomTree(filename);
        ArrayList<Node> root=new ArrayList<Node>();
        root.add(tree.root);
        stack.push(root);
        System.out.println("APSlash");
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitApDeep(x_path_grammarParser.ApDeepContext ctx){
        String filename = ctx.tag.getText();
        tree = new DomTree(filename);

        ArrayList<Node> nodes = new ArrayList<Node>();

        Stack <Node> sdfs = new Stack <Node>();
        sdfs.push (tree.root);

        // Perform DFS - Center, Left, Right order.
        while (!sdfs.isEmpty()) {
          Node node = sdfs.pop();

          // Add this node to be visited.
          nodes.add (node);
          System.out.println ("Adding node during dfs: %s");

          // Add all the children of this node to the DFS stack so that they can be added for visiting
          NodeList children = node.getChildNodes();

          for (int i = children.getLength() - 1; i >=0 ; i--) {
            sdfs.push (children.item (i));
          }
        }

        stack.push (nodes);
        return visit (ctx.rp());
    }


    //Relative
    //rp/rp
    @Override
    public ArrayList<Node> visitRpNext(x_path_grammarParser.RpNextContext ctx){
        ArrayList<Node> curr=visit(ctx.left);
        stack.push(curr);
        System.out.println("RPNext");
        return visit(ctx.right);
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
                if(node instanceof Text){
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
        ArrayList<Node> temp=visit(ctx.left);
        result.addAll(temp);
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
                Node n=curr.get(i).getAttributes().getNamedItem(ctx.Tagname().getText());
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
        ArrayList<Node> curr;
        if(!stack.empty())
            curr=stack.pop();
        else{
            curr=new ArrayList<Node>();
            curr.add(tree.root);
        }

        ArrayList<Node> result=new ArrayList<Node>();

        for(int i=0;i<curr.size();i++){
            System.out.println(curr.get(i).getNodeName());
            NodeList list=curr.get(i).getChildNodes();
            for(int j=0; j<list.getLength(); j++){
                Node node = list.item(j);
                if(node instanceof Element){
                    Element child=(Element)node;
                    if (child.getNodeName().equals(ctx.Tagname().getText()))
                        result.add(node);
                }
            }
        }
        System.out.println("Tag");
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
        res.add(tree.root);
        return res;
    }

    @Override
    public ArrayList<Node> visitFOr(x_path_grammarParser.FOrContext ctx){
        ArrayList<Node> f1=visit(ctx.left);
        ArrayList<Node> f2=visit(ctx.right);
        if(f1.size()>0 || f2.size()>0){
            return (new ArrayList<Node>());
        }
        f1.add(tree.root);
        return f1;
    }

    @Override
    public ArrayList<Node> visitFAnd(x_path_grammarParser.FAndContext ctx){
        ArrayList<Node> f1=visit(ctx.left);
        ArrayList<Node> f2=visit(ctx.right);
        if(f1.size()>0 && f2.size()>0){
            return (new ArrayList<Node>());
        }
        f1.add(tree.root);
        return f1;
    }

}
