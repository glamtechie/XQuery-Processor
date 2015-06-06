import java.util.*;

public class TableNode {
    public LinkedHashMap<String,String> fors;
    public HashMap<String,ArrayList<String>> where;
    public HashMap<Integer,ArrayList<String>> join;

    public TableNode(){
        fors=new LinkedHashMap<String,String>();
        where=new HashMap<String,ArrayList<String>>();
        join=new HashMap<Integer,ArrayList<String>>();
    }
}
