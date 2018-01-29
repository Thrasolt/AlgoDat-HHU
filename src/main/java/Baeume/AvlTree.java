public class AvlTree extends SearchTree{
  //Konstruktor
  public AvlTree(){
    super();
  }

  // Methoden
  public void insert(int key) {
    AvlNode new_node = new AvlNode(key);
    super.insert(new_node);
  }

}
