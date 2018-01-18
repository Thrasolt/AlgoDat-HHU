public class uEdge{

  // Instanzvariablen
  public Node edge1;
  public Node edge2;

  // Konstruktor
  public uEdge(node1, node2) {
    this.edge1 = new Edge(node1, node2);
    this.edge2 = new Edge(node2, node1);
  }

}
