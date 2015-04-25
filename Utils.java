//convert NodeList to Node Array
//source: http://www.java2s.com/Code/Java/XML/ConvertNodeListToNodeArray.htm
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.*;

public class Utils {

  public static ArrayList<Node> convertToArray(NodeList list)
  {
      int length = list.getLength();
      ArrayList<Node> copy = new ArrayList<Node>();

      for (int n = 0; n < length; ++n)
          copy.add(list.item(n));

      return copy;
  }
}
