import java.util.Arrays;
import java.util.Comparator;

public class pg42883 {

    public static void main(String[] args) {
        int [][] r = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};

        System.out.println(solution(r));
    }
    public static int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, Comparator.comparingInt((int[] r) -> r[0]));

        int fns = routes[0][1];
        for(int i=1; i<routes.length;i++){
            if(fns >= routes[i][0]) {
                if(fns > routes[i][1]) fns = routes[i][1];
            }else {
                fns = routes[i][1];
                answer ++;
            }
        }
            return answer+1;
    }
}
