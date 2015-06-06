import java.util.*;

public class GraphNode {
    public ArrayList<String> children;
    public String parent;
    public int table;

    public GraphNode(int no){
        children=new ArrayList<String>();
        parent=null;
        table=no;
    }
}
