public class Node {

  // Instanzvariablen
  private int value;
  private int key;

  // Adjacenvy variables
  private ArrayList<Edge> outEdges;
  private ArrayList<Edge> inEdges;

  // Konstruktor
  public Node(int key, int value) {
    this.key=key;
    this.value=value;
  }

  public Node(int key) {
    this.key=key;
  }

  public void addOutEdge(Edge e){
    boolean edgeTest = e.node1 == this;
    edgeTest = edgeTest && !this.outEdges.contains(e);
    if(edgeTest) {
      this.outEdges.add(e);
    }
  }

  public void addInEdge(Edge e){
    boolean edgeTest = e.node2 == this;
    edgeTest = edgeTest && !this.inEdges.contains(e);
    if(edgeTest) {
      this.inEdges.add(e);
    }
  }

  // Methoden
  public int getKey(){
    return this.key;
  }

}
