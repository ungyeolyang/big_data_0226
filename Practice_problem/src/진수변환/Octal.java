package 진수변환;

import java.util.Scanner;
import java.util.Stack;

public class Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < input.length();i++){
            int x = input.charAt(i) - '0' ;
            int y = (int)Math.pow(8,input.length()-1-i);
            sum += x * y;
        }
        if(sum == 0){System.out.println(0); return;}
        while(true){
            if(sum/2 == 0){stack.push(1);break;}
            stack.push(sum%2);
            sum /= 2;
        }
        int size = stack.size();
        for(int i=0; i< size; i++){
            System.out.print(stack.pop());
        }
    }
}
