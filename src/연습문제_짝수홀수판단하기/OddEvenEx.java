package 연습문제_짝수홀수판단하기;

import java.util.Scanner;

public class OddEvenEx {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String oe = (num % 2 == 0 ) ? "짝수 입니다": "홀수 입니다";
        System.out.println(oe);
//        if(oe % 2 == 0){
//            System.out.println("짝수 입니다");
//        }
//        else {
//            System.out.println("홀수 입니다");
//       }
    }
}
