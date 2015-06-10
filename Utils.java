//convert NodeList to Node Array
//source: http://www.java2s.com/Code/Java/XML/ConvertNodeListToNodeArray.htm
import java.util.*;
import org.w3c.dom.*;
//import org.antlr.v4.runtime.tree.*;
import javax.xml.transform.*;
import java.io.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class Utils {

  public static ArrayList<Node> convertToArray(NodeList list)
  {
      int length = list.getLength();
      ArrayList<Node> copy = new ArrayList<Node>();

      for (int n = 0; n < length; ++n)
          copy.add(list.item(n));

      return copy;
  }

  public static ArrayList<Node> getUnique(ArrayList<Node> nodes) {
    return new ArrayList<Node>(new LinkedHashSet<Node>(nodes));
    }

  public static void preorderTraversal(Node root, ArrayList<String> pre,int tabs, int maxtab)
  {
	String tab = "";
	String attr = "";
	for (int k=0;k <tabs; k++)
		tab = tab+"\t";
	String nodename = "";
        if(root==null)
		return;
	if (root instanceof Element)
	{
		nodename = root.getNodeName();
		pre.add("\n");
		NamedNodeMap attrs = root.getAttributes();
        	for (int i = 0; i < attrs.getLength(); i++)
		{
            		Attr attribute = (Attr) attrs.item(i);
			attr = attr+" "+attribute.getName()+"=\""+attribute.getValue()+"\"";
        	}
        	pre.add(tab+"<"+nodename+attr+">");
		NodeList children = root.getChildNodes();
        	for (int i = 0; i < children.getLength(); i++)
		{
			if (children.item(i) instanceof Text && children.item(i).getTextContent().length()!=0)
				pre.add(children.item(i).getTextContent());
			else
			{
	 			maxtab = tabs+1;
				preorderTraversal(children.item(i), pre, tabs+1, maxtab);
			}
		}
		if (tabs < maxtab)
        	{
			pre.add("\n"+tab);
		}
		pre.add("</"+nodename+">");
        	return;
   	}
	else if (root instanceof Text && root.getTextContent().length() != 0)
	{
		pre.add(root.getTextContent());
	}
        return;
  }
  public static void printInDocOrder(ArrayList<Node> nodes)
  {
	ArrayList<String> pre = new ArrayList<String>();
	//System.out.format("Size of the result %d",nodes.size());
	for(int i=0;i<nodes.size();i++)
	{
		preorderTraversal(nodes.get(i), pre, 0,0);
		if (pre.isEmpty() == false)
		{
			for(int j=0;j<pre.size();j++)
				System.out.format("%s",pre.get(j));
			pre.clear();
		}
	}
	return;
  }

  public static String printNodes(ArrayList<Node> nodes) throws Exception{
      StringBuffer buff=new StringBuffer();
        for (Node n:nodes){
            //System.out.println("printing..");

            buff.append(xmlPrint(n.getOwnerDocument()));

        }

        return (buff.toString());

  }

  public static final String xmlPrint(Document xml) throws Exception {
    Transformer tf = TransformerFactory.newInstance().newTransformer();
        tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        Writer out = new StringWriter();
        tf.transform(new DOMSource(xml), new StreamResult(out));
        return (out.toString());
  }

  public static String makefQuery(HashMap<Integer,TableNode> info, int n){
    if(info.get(n).fors.isEmpty()){
      return null;
    }
    else{
      String[] forstats=Arrays.asList(info.get(n).fors.keySet().toArray()).toArray(new String[info.get(n).fors.keySet().toArray().length]);
      StringBuffer fo=new StringBuffer("for ");
      fo.append(forstats[0]);
      fo.append(" in ");
      fo.append(info.get(n).fors.get(forstats[0]));
      for(int i=1;i<forstats.length;i++){
        fo.append(" , ");
        fo.append(forstats[i]);
        fo.append(" in ");
        fo.append(info.get(n).fors.get(forstats[i]));
      }
      fo.append(makeWhere(n,info));
      fo.append(makeReturn(forstats));
      return fo.toString();
    }
  }

  public static String makeElem(String s){
    StringBuffer e=new StringBuffer();
    String var=s.replaceAll("\\$","");
    e.append("<"+var+">{ ");
    e.append("$"+var);
    e.append(" }</"+var+">");
    return e.toString();
  }
  public static String makeReturn(String[] vars){
    StringBuffer ret=new StringBuffer(" return ");
    ret.append("<tuple>{ ");
    ret.append(makeElem(vars[0]));
    for (int i=1;i<vars.length;i++){
      ret.append(", ");
      ret.append(makeElem(vars[i]));
    }
    ret.append(" }</tuple>");
    return ret.toString();
  }

  //TODO
  public static String makeWhere(int n,HashMap<Integer,TableNode> info){

    //check if while exists
    if (info.get(n).where.isEmpty())
      return "";
    else{
      StringBuffer where=new StringBuffer(" where ");
      String[] conds=Arrays.asList(info.get(n).where.keySet().toArray()).toArray(new String[info.get(n).where.keySet().toArray().length]);
      where.append(conds[0]);
      where.append(" = ");
      where.append(info.get(n).where.get(conds[0]).get(0));
      for(int j=1;j<info.get(n).where.get(conds[0]).size();j++){
          where.append(" and ");
          where.append(conds[0]);
          where.append(" = ");
          where.append(info.get(n).where.get(conds[0]).get(j));
        }
      for(int i=1;i<conds.length;i++){
        where.append(" and ");
        where.append(conds[i]);
        where.append(" = ");
        where.append(info.get(n).where.get(conds[i]).get(0));
        for(int j=1;j<info.get(n).where.get(conds[i]).size();j++){
          where.append(" and ");
          where.append(conds[i]);
          where.append(" = ");
          where.append(info.get(n).where.get(conds[i]).get(j));
        }
      }
      return where.toString();
    }

  }
  public static String constructJoin(HashMap<Integer,TableNode> info, int curr, int whom, String sjoin){
    StringBuffer j=new StringBuffer("join( ");
    String q1=makefQuery(info, curr);
    String q2=makefQuery(info,whom);
    if (sjoin!=null){
      j.append(sjoin);
      j.append(", ");
      if(q1!=null)
        j.append(q1);
      else
        j.append(q2);
    }
    else{
      j.append(q1);
      j.append(", ");
      j.append(q2);
    }
    j.append(", ");
    String l1=makeList(info.get(curr).join.get(whom));
    String l2=makeList(info.get(whom).join.get(curr));
    j.append(l1);
    j.append(", ");
    j.append(l2);
    j.append(" )");
    return j.toString();
  }

  public static String makeList(ArrayList<String> vars){
    StringBuffer l=new StringBuffer("[ ");
    if((vars!=null) && (vars.size()>0)){
      l.append(vars.get(0));
      for(int i=1;i<vars.size();i++){
        l.append(", ");
        l.append(vars.get(i));
      }
    }
    l.append(" ]");
    return l.toString();
  }

  public static HashMap<Integer,TableNode> createNode(HashMap<Integer,TableNode> info, int curr, int whom){
    int news=(-1*curr*10)+whom;
    info.put(news,new TableNode());
    //copy all stuff from curr into news
    info.get(news).join.putAll(info.get(curr).join);
    Set<Integer> skey=info.get(whom).join.keySet();
    Integer[] keys=Arrays.asList(skey.toArray()).toArray(new Integer[skey.toArray().length]);
    for(int k:keys){
      if(info.get(news).join.containsKey(k)){
          info.get(news).join.get(k).addAll(info.get(whom).join.get(k));
      }
      else{
          info.get(news).join.put(k,info.get(whom).join.get(k));
      }
    }
    return info;

  }

}
