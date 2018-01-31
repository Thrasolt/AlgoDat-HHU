import org.junit.Test;
import static org.junit.Assert.*;

public class SearchTest {
    @Test
    public void testMedianOfMedians() {
        MedianOfMedians medofMed = new MedianOfMedians();

        int[] testUtilfindeMed= {2,1,5,4,3};
        assertEquals(3,medofMed.findMedianDirectly(testUtilfindeMed));
    }
}
