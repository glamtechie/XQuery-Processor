import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.w3c.dom.*;
import java.util.*;

public class XPathRunner{
    public static void main(String[] args) throws Exception {
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in); //"document(\"j_caesar.xml\")/TITLE");

    // create a lexer that feeds off of input CharStream
    x_path_grammarLexer lexer = new x_path_grammarLexer(input);

    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    x_path_grammarParser parser=new x_path_grammarParser(tokens);
    ParseTree tree = parser.r();

    //String filename="";
    //DomTree domtree=new DomTree(filename);

    EvalVisitor eval = new EvalVisitor();

    ArrayList<Node> result=new ArrayList<Node>();
    if (eval.visit(tree)!=null)
        result=eval.visit(tree);

    System.out.println(result.size());
    for(int i=0;i<result.size();i++){
        if (result.get(i) instanceof Element){
            Element n=(Element) result.get(i);
            System.out.println(n.getTextContent());
        }
    }
}
}
