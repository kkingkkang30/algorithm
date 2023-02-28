public class pg12914 {

    public long solution(int n) {
        long answer = 0;
        int arr[] = new int[n+1];


        arr[1] =1;
        arr[2] = 1;
        arr[3] = 3;
        arr[4] = 5;
        for(int i=5;i<n;i++){
            arr[i] = 2* arr[i-2] + arr[i-1];
        }

        answer =arr[n];
        return answer;
    }
}
