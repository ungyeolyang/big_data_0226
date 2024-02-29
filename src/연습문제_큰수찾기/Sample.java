package 연습문제_큰수찾기;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세자리의 정수를 입력하세요");
        int num = sc.nextInt();
        int a = num/100;
        int b = (num%100)/10;
        int c = num%10;
        int result;
        int result1;

        result = (a > b) ? Math.max(a, c) : Math.max(b, c);
        result1 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println(num + "에서 가장큰수는 "+ result + "입니다.");
        System.out.println(num + "에서 가장큰수는 "+ result1 + "입니다.");

    }
}
