import junit.framework.TestCase;
import org.junit.Test;

public class pg76502Test extends TestCase {

    @Test
    public void testMain(){
        String s1 = "[](){}";
        String s2 = "}]()[{";
        String s3 = "[)(]";
        String s4 = "}}}";

        assertEquals(pg76502.solution(s1),3);
        assertEquals(pg76502.solution(s2),2);
        assertEquals(pg76502.solution(s3),0);
        assertEquals(pg76502.solution(s4),0);
    }
}