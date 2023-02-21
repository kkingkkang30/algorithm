import junit.framework.TestCase;
import org.junit.Test;

public class pg12953Test extends TestCase {

    @Test
    public void testMain() {
        int[] arr1 = {2, 6, 8, 14};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3,4,5};
        int[] arr4 = {11, 13, 17};

        assertEquals(168, pg12953.solution(arr1));
        assertEquals(6, pg12953.solution(arr2));
        assertEquals(60, pg12953.solution(arr3));
        assertEquals(2431, pg12953.solution(arr4));

    }
}