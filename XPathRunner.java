import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.w3c.dom.*;
import java.util.*;

public class XPathRunner{
    public static void main(String[] args) throws Exception {
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in);

    // create a lexer that feeds off of input CharStream
    x_path_grammarLexer lexer = new x_path_grammarLexer(input);

    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    x_path_grammarParser parser=new x_path_grammarParser(tokens);
    ParseTree tree = parser.r();

    String filename="";
    DomTree domtree=new DomTree(filename);

    EvalVisitor eval = new EvalVisitor(domtree);

    ArrayList<Node> result=eval.visit(tree);
}
}
