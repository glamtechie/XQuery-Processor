import org.w3c.dom.*;
import java.util.*;

public class Context {
    public HashMap<String,ArrayList<Node>> map;

    public Context(Context c){
        map= new HashMap<String,ArrayList<Node>>();
        map.putAll(c.map);
    }

    public void set(String s, ArrayList<Node> list ){
        map.put(s,list);
    }

    public ArrayList<Node> get(String s){
        return map.get(s);
    }

    public boolean equals(Context c){
        if (c.map.equals(this.map))
            return true;
        return false;
    }
}
