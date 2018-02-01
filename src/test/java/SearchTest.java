import org.junit.Test;
import static org.junit.Assert.*;

public class SearchTest {
    @Test
    public void testMedianOfMedians() {
        MedianOfMedians medofMed = new MedianOfMedians();

        int[] testPart = {1,2,3};
        int[] medPart = medofMed.partition(testPart, 2, 2);
        assertEquals(1,medPart.length);
        assertEquals(2,medPart[2]);

        int[] testUtilfindeMed= {2,1,5,4,3};
        assertEquals(3,medofMed.findMedianDirectly(testUtilfindeMed));
    }
}
