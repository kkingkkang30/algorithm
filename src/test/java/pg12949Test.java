import junit.framework.TestCase;
import org.junit.Test;

public class pg12949Test extends TestCase {

    @Test
    public void testMain(){
        int[][]arr1 = new int[][]{{2, 3,2}, {4, 2,4},{3,1,4}};
        int[][]arr2 = new int[][]{{5,4,3},{2,4,1},{3,1,1}};
        int[][]answer =new int[][] {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
        assertSame(pg12949.solution(arr1,arr2), answer);
    }

}