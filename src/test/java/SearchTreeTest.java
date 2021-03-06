/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchTreeTest {

    @Test
    public void testSrchTrees() {

      // Test 1
      SearchTree testTree= new SearchTree();
      int[] testArray = {4,2,6,1,3,5,7};
      for (int i = 0; i<testArray.length; i++){
        testTree.insert(testArray[i]);
      }
      assertEquals(testTree.getHead().getKey(),4);
      assertEquals(testTree.getHead().getLeft().getKey(),2);

      // Test 2
      SearchTree testTree2= new SearchTree();
      int[] testArray2 = {1,2,3,4,5,6,7};
      for (int i = 0; i<testArray2.length; i++){
        testTree2.insert(testArray2[i]);
      }
      assertEquals("1234567",testTree2.inOrderTreeWalk());
      assertEquals(testTree2.getHead().getKey(),1);
      assertEquals(testTree2.getHead().getRight().getKey(),2);
      assertEquals(testTree2.getHead().getLeft(),null);

    }

    @Test
    public void testSorting() {
      // Quicksort
      /*
      Sorting folge1 = new Sorting({9,8,7,6,5,4,3,2,1});
      assertEquals("1,2,3,4,5,6,7,8,9", folge1.toString());
      Sorting folge2 = new Sorting({9,8,7,6,5,4,3,2,1});
      assertEquals("9,11,12,19,34,45,47", folge2.toString());
      Sorting folge3 = new Sorting({9,8,7,6,5,4,3,2,1});
      assertEquals("1,2,3,4,5,6,7,8,9", folge3.toString());
      */
    }
}
