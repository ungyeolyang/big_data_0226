package 연습문제_윤년계산하기;
//일반적으로 4년에 한번 2월 29일이 생긴다
//100으로 나눠지면 윤년이아니다
//400으로 나눠지면 윤년이다

import java.util.Scanner;

public class LeapYearEx {
    public static void main(String[] args) {
        System.out.println("연도를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if((year % 4 == 0) && (year % 100 != 0 || year % 400 ==0)){
            System.out.println("윤년 입니다");
        }
        else {
            System.out.println("윤년이 아닙니다");
        }


    }
}
