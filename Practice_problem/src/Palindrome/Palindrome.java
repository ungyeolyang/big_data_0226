package Palindrome;
// 문자열을 거꾸로 뒤집었을때도 같은문자인지 확인

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean isSame = true;
        char[] chars = name.toCharArray();
        for(int i = 0; i < chars.length/2; i++){
            if(chars[i] == chars[chars.length -(i+1)]);
            else {isSame = false; break;}
        }
        if(isSame) System.out.println(isSame);
        else System.out.println(isSame);
    }
}