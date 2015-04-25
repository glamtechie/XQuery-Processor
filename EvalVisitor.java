import org.w3c.dom.Node;
import java.util.*;
import org.antlr.v4.runtime.tree.*;


public class EvalVisitor extends x_path_grammarBaseVisitor<ArrayList<Node>>{

    private Stack<ArrayList<Node>> stack;
    private DomTree tree;

    public EvalVisitor(DomTree tree){
        super();
        stack=new Stack<ArrayList<Node>>();
        this.tree=tree;
    }

    @Override
    public ArrayList<Node> visitR(x_path_grammarParser.RContext ctx){
        ArrayList<Node> root = new ArrayList<Node>();
        root.add(tree.root);
        stack.push(root);
        return visitChildren(ctx);
    }

    //todo
    @Override
    public ArrayList<Node> visitAp(x_path_grammarParser.ApContext ctx){
        int n=ctx.getChildCount();
        if (n==6){
            //check if the top of the stack has root
            if(!tree.root.isSameNode(stack.peek().get(0))){
                ArrayList<Node> root = new ArrayList<Node>();
                root.add(tree.root);
                stack.push(root);
            }
            return slash(stack.pop(),ctx.getChild(5));

        }
    }

    private ArrayList<Node> slash(ArrayList<Node> n, ParseTree t ){
        ArrayList<Node> result = new ArrayList<Node>();
        return result;
    }

}
