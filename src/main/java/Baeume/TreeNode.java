public class TreeNode{

  // Instanzvariablen
  private String value;
  private int key;

  private TreeNode left;
  private TreeNode right;

  // Konstruktor
  public TreeNode(){
  }

  public TreeNode(int key){
    this.key = key;
  }

  // Methoden
  public int getKey(){
    return this.key;
  }

  public TreeNode getLeft(){
    return this.left;
  }

  public TreeNode getRight(){
    return this.right;
  }

  public void setKey(int key){
    this.key = key;
  }

  public void setRight(TreeNode node){
    this.right = node;
  }

  public void setLeft(TreeNode node){
    this.left = node;
  }
}
