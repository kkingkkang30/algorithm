import java.util.Arrays;

public class pg12987 {

    public static void main(String[] args) {
        int [] a  = {5,1,3,7};
        int [] b = {2,2,6,8};

        System.out.println(solution(a,b));
    }
    public static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int a = A[0];
        int index = 0;
        for(int i=0; i<B.length;i++){
            a = A[index];
            if(index>=B.length) break;
            if(a<B[i]){
                answer++;
                index ++;
            }
        }
        return answer;
    }
}
