import org.junit.Test;
import static org.junit.Assert.*;

public class SortingTest {
    @Test
    public void testQuickSort() {

      Sorting sort = new Sorting();

      int[] testSeries0 = {2,1};
      sort.quicksort(testSeries0);
      assertEquals("1 2",sort.printSeries(testSeries0));

      int[] testSeries1 = {2,3};
      sort.quicksort(testSeries1);
      assertEquals("2 3",sort.printSeries(testSeries1));

      int[] testSeries2 = {1,3,2};
      sort.quicksort(testSeries2);
      assertEquals("1 2 3",sort.printSeries(testSeries2));

      /*

      int[] testSeries2 = {2,1,5,4,3};
      sort.quicksort(testSeries2);
      assertEquals("1 2 3 4 5",sort.printSeries(testSeries2));


      int[] testSeries10 = {3,4,7,1,2,11,12,10,9};
      sort.quicksort(testSeries10);
      assertEquals("1 2 3 4 7 9 10 11 12",sort.printSeries(testSeries10));

      int[] testSeries20 = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
      sort.quicksort(testSeries20);
      assertEquals("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15",sort.printSeries(testSeries20));

      int[] testSeries30 = {3,4,7,1,2,11,9,25};
      sort.quicksort(testSeries30);
      assertEquals("1 2 3 4 7 9 11 25",sort.printSeries(testSeries30));
      */
    }
}
