public class AvlNode extends TreeNode{
  // Instanzvariablen
  private int balance;
  private int height;


  // Konstruktor
  public AvlNode(){
    super();
  }

  public AvlNode(int key){
    super(key);
  }

  // Methoden
  public void calculateHeight(){
    if(super.getLeft() == null & super.getRight() == null){
      this.height = 0;
    } else if (super.getLeft() == null ) {
      this.height = 1 + ((AvlNode)super.getRight()).getHeight();
    } else if (super.getRight() == null ) {
      this.height = 1 + ((AvlNode)super.getLeft()).getHeight();
    } else {
      this.height = 1 + Math.max(((AvlNode)super.getLeft()).getHeight(), ((AvlNode)super.getRight()).getHeight());
    }
  }

  public int getBalance(){
    return this.balance;
  }

  public int getHeight(){
    return this.height;
  }

  public void setHeight(int height){
    this.height = height;
  }
}
