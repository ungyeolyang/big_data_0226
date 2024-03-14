package 스택_예제;

import java.util.Scanner;
import java.util.Stack;

public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("수식 입력 :");
        String st = sc.next();
        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(!stack.isEmpty()) stack.pop();
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("괄호가 일치 합니다.");
        }
        else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
