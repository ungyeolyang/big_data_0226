package 나머지연산자_연습;

import java.util.Scanner;

public class ModEx {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num/100;
        int b = (num%100)/10;
        int c = num%10;
        System.out.println("100의자리 : "+ a + "\n10의자리  : "+ b + "\n1의자리   : "+ c);


    }
}
