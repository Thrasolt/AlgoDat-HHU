import java.util.*;

public class DirGraph {

  // Instanzvariablen
  private ArrayList<Node> nodeSet;
  private ArrayList<Edge> edgeSet;

  // Konstruktor
  public DirGraph(){
    this.nodeSet = new ArrayList<Node>;
    this.edgeSet = new ArrayList<Edge>;
  }

  // Methoden
  public void addNode(Node node){
    boolean testNode = !this.nodeSet.contains(node);
    if(testNode){
      this.nodeSet.add(node);
    }
  }

  public void addEdge(Edge edge){
    boolean edgeTest = !this.edgeSet.contains(edge);
    boolean nodeS = !this.nodeSet.contains(edge.getStartNode());
    boolean nodeE = !this.nodeSet.contains(edge.getEndNode());
    if(edgeTest && nodeS && nodeE){
      this.edgeSet.add(edge);
    }
  }

  public void addEdge(Node nodeS, Node nodeE){
    boolean !testNodeS = this.nodeSet.contains(nodeS);
    boolean !testNodeE = this.nodeSet.contains(nodeE);
    if(testNodeS && testNodeE){
    }

  }

}
