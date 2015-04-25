import org.w3c.dom.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;


public class EvalVisitor extends x_path_grammarBaseVisitor<ArrayList<Node>>{

    private Stack<ArrayList<Node>> stack;
    //private ArrayList<Node> list;
    private DomTree tree;

    public EvalVisitor(DomTree tree){
        super();
        //list=new ArrayList<Node>();
        this.tree=tree;
    }

    //todo
    @Override
    public ArrayList<Node> visitApSlash(x_path_grammarParser.ApSlashContext ctx){
        ArrayList<Node> root=new ArrayList<Node>();
        root.add(tree.root);
        stack.push(root);
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitRpNext(x_path_grammarParser.RpNextContext ctx){
        ArrayList<Node> curr=visit(ctx.left);
        stack.push(curr);
        return visit(ctx.right);
    }

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

        return result;
    }

}