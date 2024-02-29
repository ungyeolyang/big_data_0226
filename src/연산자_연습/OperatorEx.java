package 연산자_연습;

import 스캐너_사용하기.ScnnnerEx;

import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {
        System.out.println(5 / 0.0); //Infinity
        System.out.println(5 % 0.0); //Nan
        // System.out.println(5/0); 에러발생

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됨");
        }

        int num1 = 10;
        System.out.println(num1 += 2);
        System.out.println(num1 -= 3); // 위식이 num1에 영향을 준다.
        System.out.println(num1 *= 4);

        int num2 = 10;
        System.out.println("후치 : " + (num2++) + " " + num2); // 다음식에 영향

        int num3 = 10;
        System.out.println("전치 : " + (++num3) + " " + num3); // 바로 증가

        int x = 10;
        int y = 20;
        boolean rst1;
        boolean rst2;
        rst1 = !((x > 0) || (x > y));
        rst2 = !(x > 0) || (x < y);
        System.out.println(rst1);
        System.out.println(rst2);

        //3항연산자
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;
        System.out.println(isAdult);
    }
}
