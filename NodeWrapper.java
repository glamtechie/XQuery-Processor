import java.util.List;
import java.util.ArrayList;
import org.w3c.dom.*;

public class NodeWrapper {
  private ArrayList<Node> nodeList;

  public NodeWrapper (ArrayList<Node> _nodeList) {
    this.nodeList = _nodeList;
  }

  @Override
  public boolean equals (Object _nodeWrapperObj) {

    assert (_nodeWrapperObj instanceof NodeWrapper);
    List<Node> _nodeList = ((NodeWrapper) _nodeWrapperObj).nodeList;
    assert _nodeList.size() == this.nodeList.size();

    // Compare each node individually
    for (int i = 0; i < this.nodeList.size(); i++) {

      Node node1 = this.nodeList.get(i);
      //System.out.println(node1);
      Node nodeOther = _nodeList.get(i);
      //System.out.println(nodeOther);

      if (!node1.isEqualNode (nodeOther)) {
        return false;
      }
    }
    //System.out.println("equals");
    return true;
  }

  @Override
  public int hashCode () {
    int hashCode = 31;
    for (Node node : this.nodeList) {
      String con=node.getTextContent();
      if(con!=null){
        hashCode += con.hashCode();
      }
    }
    return 1;
  }

}
