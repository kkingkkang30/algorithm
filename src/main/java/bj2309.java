import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bj2309 {
    // 백준 2309 일곱 난쟁이
    public static void main(String[] args) {

        ArrayList<Integer> key = new ArrayList<>();
        int allSum =0;
        Scanner s = new Scanner(System.in);

        for(int i=0; i<9;i++){
            key.add(s.nextInt());
            allSum += key.get(i);
        }

        int interval = allSum-100;
        extracted(key, interval);

        Object[] result = key.toArray();
        Arrays.sort(result);

       for(Object k : result){
           System.out.println(k.toString());
       }
    }

    private static void extracted(ArrayList<Integer> key, int interval) {
        for(int i = 0; i< key.size()-1 ; i++){
            for(int j = i+1; j< key.size() ; j++){
                if(i==j) continue;
                int sum = key.get(i) + key.get(j);
                if(sum == interval){
                    key.remove(key.get(j));
                    key.remove(key.get(i));
                    return;
                }
            }
        }
    }
}