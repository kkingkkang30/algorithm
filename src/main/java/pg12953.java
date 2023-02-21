public class pg12953 {

    public static void main(String[] args) {
        int [] arr = {2,6,8,14};

        System.out.println(solution(arr));
    }
    // 최소공배수 = 두수의 곱 / 최대공약수
    public static int solution(int[] arr) {
        int answer = 1;

        int gcdSum = gcd(arr[0], arr[1]);
        int lcm = arr[0] * arr[1] / gcdSum;

        for(int i=2; i<arr.length;i++){
           gcdSum = gcd(lcm,arr[i]);
           lcm = (lcm * arr[i]) / gcdSum;
        }
        return lcm;
    }


    public static int gcd(int num1, int num2){
        return num2 % num1 ==0 ? num1 : gcd(num2%num1, num1);
    }
}
