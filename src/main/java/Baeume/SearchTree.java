public class SearchTree{

  // Instanzvariablen
  private TreeNode head;

  // Konstruktor
  public SearchTree(){
  }

  public static void rekInsert(TreeNode node, TreeNode new_node){
    if(node != null){
      // Left side
      if(new_node.getKey() <= node.getKey()){
        if(node.getLeft() == null){
          node.setLeft(new_node);
        } else {
          // Rekursion
          rekInsert(node.getLeft(), new_node);
        }
      } else {
        // Right side
        if(node.getRight() == null){
          node.setRight(new_node);
        } else {
          // Rekursion
          rekInsert(node.getRight(), new_node);
        }
      }
    }
  }

  public void insert(int key) {
    TreeNode new_node = new TreeNode();
    new_node.setKey(key);

    // Check head
    if(this.head == null) {
      this.head = new_node;
    } else {
      //Insert inner Node
      rekInsert(this.head, new_node);
    }
  }

  public void insert(TreeNode new_node) {
    // Check head
    if(this.head == null) {
      this.head = new_node;
    } else {
      //Insert inner Node
      rekInsert(this.head, new_node);
    }
  }

  public String inOrderTreeWalk(){
    return inOrderTreeWalk(this.head);
  } // inOrderTreeWalk

  public String inOrderTreeWalk(TreeNode node){
    String output = "";
    if(node != null){
      output = output + inOrderTreeWalk(node.getLeft());
      output = output + Integer.toString(node.getKey());
      output = output + inOrderTreeWalk(node.getRight());
    }
    return output;
  } // inOrderTreeWalk

  public boolean contains(int key){
    TreeNode res = srchTree(this.head, key);
    if(res == null){
      return false;
    }
    return true;
  }

  public static TreeNode srchTree(TreeNode node, int key){
    if(node != null){
      if(key == node.getKey()){
        return node;
      } else if(key < node.getKey()){
        return srchTree(node.getLeft(), key);
      } else {
        return srchTree(node.getRight(), key);
      }
    }
    return null;
  } // srchTree

  // geters und setters

  public TreeNode getHead(){
    return this.head;
  }

}
