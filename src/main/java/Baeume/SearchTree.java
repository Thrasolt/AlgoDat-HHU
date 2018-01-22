public class SearchTree{

  // Instanzvariablen
  private TreeNode head;

  public void inOrderTreeWalk(TreeNode node){
    if(node != null){
      inOrderTreeWalk(node.getLeft());
      System.out.println(node.getKey());
      inOrderTreeWalk(node.getRight());
    }
  } // inOrderTreeWalk

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

}
