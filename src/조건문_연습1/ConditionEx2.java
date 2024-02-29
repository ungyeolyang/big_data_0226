package 조건문_연습1;

import java.util.Scanner;

public class ConditionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// System.in은 콘솔 입력, File 입력으로 변경 가능
        System.out.println("문자를 입력하세요");
        char ch = sc.next().charAt(0);
        System.out.println(ch + "의 아스키코드는" + (int)ch + " 입니다");

        if (ch >='a' && ch <= 'z'){
            System.out.println(ch + "는 소문자 입니다");
        } else if (ch >= 'A' && ch <= 'Z' ) {
            System.out.println(ch + "는 대문자 입니다");
        }
        else if(ch >= '0' && ch <='9' ){
            System.out.println(ch + "는 숫자입니다");
        }
        else {
            System.out.println(ch + "는 알파벳도 숫자도 아닙니다");
        }
    }
}
