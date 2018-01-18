public class Edge{

  // Instanzvariablen
  private Node node1;
  private Node node2;

  // Konstruktor
  public Edge(Node node1, Node node2) {
    this.node1=node1;
    this.node2=node2;
  }

  //Methoden
  public Node getStartNode(){
    return this.node1;
  }

  public Node getEndNode(){
    return this.node2;
  }
}
