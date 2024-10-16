package 이진수덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class binary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        String x = st.nextToken();
        String y = st.nextToken();
        if(x.length() > y.length()){
            y = "0".repeat(x.length()-y.length()) + y;
        } else x = "0".repeat(y.length()-x.length())+ x;
        int c = 0;
        for(int i = x.length(); i>0; i--){
            int a = x.charAt(i-1) -'0';
            int b = y.charAt(i-1)- '0';
            if(a+b+c == 3) {
                stack.push(1);
                c = 1;
            } else if (a+b+c == 2){
                stack.push(0);
                c = 1;
            } else if (a+b+c == 1){
                stack.push(1);
                c = 0;
            } else {
                stack.push(0);
                c = 0;
            }
        }
        if (c ==1){
            stack.push(1);
        }
//        int size = stack.size();
//        for(int i =0; i < size; i++){
//            System.out.print(stack.pop());
//        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
