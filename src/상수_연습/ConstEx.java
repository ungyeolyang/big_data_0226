package 상수_연습;

import java.util.Scanner;

public class ConstEx {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10; // 관례적으로 final은 모두 대문자 이어줄때 _ 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("수입을 입력하세요");
        int income = sc.nextInt();// 정수값을 입력 받아. income에 대입
        System.out.println("당신이 내야할 세금은" + (income * TAX_RATE));
    }
}
