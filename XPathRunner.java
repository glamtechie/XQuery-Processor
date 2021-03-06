import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.w3c.dom.*;
import java.util.*;
import java.io.*;

public class XPathRunner{
    public static void main(String[] args) throws Exception {
    // create a CharStream that reads from standard input
    BufferedReader br = null ;
    StringBuilder sb = new StringBuilder();
    try {
        br = new BufferedReader(new FileReader(args[0]));
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
    } finally {
        br.close();
    }

    ANTLRInputStream input = new ANTLRInputStream(sb.toString());

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
    //if (eval.visit(tree)!=null)
    result=eval.visit(tree);
    //Utils.printInDocOrder(result);
    Writer writer = null;
    try {
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "utf-8"));
        writer.write(Utils.printNodes(result));
    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
       try {writer.close();} catch (Exception ex) {/*ignore*/}
    }
    /*result=eval.visit(tree);
    System.out.println(result.size());
    for(int i=0;i<result.size();i++){
        if (result.get(i) instanceof Element){
            Element n=(Element) result.get(i);
            System.out.println(n.getNodeName());
            //System.out.println(n.hasChildNodes());
            System.out.println(n.getTextContent());
        }
    }*/
    //System.out.println(result.size());
    //System.out.println("\n");
}
}
