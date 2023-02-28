import java.util.*;

public class pg138476 {

    public static void main(String[] args) {
       int [] arr = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
       int k = 6;

        System.out.println(solution(k,arr));
    }

    public static
    int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        Map <Integer, Integer> count = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
           count.put(tangerine[i], count.getOrDefault(tangerine[i],0) +1);
        }

        List<Integer> keySet = new ArrayList<>(count.keySet());
        keySet.sort(Comparator.comparing(count::get));

        for(int i=keySet.size()-1 ; i>=0;i--){
            sum += count.get(keySet.get(i));
            if(sum >= k) {
                answer = keySet.size() - i;
                break;
            }
        }
        return answer;
    }
}
