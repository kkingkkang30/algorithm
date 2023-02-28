import java.util.Stack;

public class pg76502 {


    public static int solution(String s) {

        int cnt=1;
        int answer =0;
        if(s.length()%2 ==1) return 0;
        while(cnt<s.length()){
            answer += check(s);
            cnt++;
            s = s.substring(1) + s.substring(0,1);
        }
        return answer;
    }

    public static int check(String s){

        Stack<String> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            String str = s.substring(i,i+1);

            if(st.empty()) st.push(str);
            else{
                String bfStr = st.peek();
                if((str.equals(")") && bfStr.equals("("))
                        ||(str.equals("}") && bfStr.equals("{"))
                        || (str.equals("]") && bfStr.equals("["))
                ) st.pop();
                else st.push(str);
            }
        }
        if(st.empty()) return 1;
        else return 0;
    }
}
