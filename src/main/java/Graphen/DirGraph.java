public class DirGraph {

  // Instanzvariable
  private Entry head;

  public class Entry{

    // Instanzvariable
    private Node node;
    private Entry next;
    private EdgeList inEdges;
    private EdgeList OutEdges;

    public class EdgeList{
      // Instanzvariable
      private EdgeEntry edgeHead;

      public class EdgeEntry{
        // Instanzvariable
        private Edge edge;
        protected EdgeEntry next;
      }
    }

  }
}
