//convert NodeList to Node Array
//source: http://www.java2s.com/Code/Java/XML/ConvertNodeListToNodeArray.htm
import java.util.*;
import org.w3c.dom.*;
import org.antlr.v4.runtime.tree.*;


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
	for (int k=0;k <tabs; k++)
		tab = tab+"\t";		
	String nodename = "";
        if(root==null)
		return; 
	if (root instanceof Element)
	{

		nodename = root.getNodeName();
		pre.add("\n");
        	pre.add(tab+"<"+nodename+">");
        	NodeList children = root.getChildNodes();
        	for (int i = 0; i < children.getLength(); i++) 
		{
			if (children.item(i) instanceof Text)
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
	else if (root instanceof Text) 
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
		for(int j=0;j<pre.size();j++)
		{
			System.out.format("%s",pre.get(j));		
		}
		pre.clear();
	}
	return;
  }

}
