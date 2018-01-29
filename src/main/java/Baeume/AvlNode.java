public class AvlNode extends TreeNode{
  // Instanzvariablen
  private int balance;

  // Konstruktor
  public AvlNode(){
    super();
  }

  public AvlNode(int key){
    super(key);
  }

  // Methoden
  public int getBalance(){
    return this.balance;
  }

  public int setBalance(int balance){
    this.balance = balance;
  }
}
