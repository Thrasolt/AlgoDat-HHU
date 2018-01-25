public class Main {
  public static void main(String[] args) {
    SearchTree testTree= new SearchTree();
    int[] testArray = {4,2,6,1,3,5,7};
    for (int i = 0; i<testArray.length; i++){
      testTree.insert(testArray[i]);
    }
    System.out.println("head key: "+testTree.getHead().getKey());
  }

  public String getGreeting(){
    return "Works";
  }
}
