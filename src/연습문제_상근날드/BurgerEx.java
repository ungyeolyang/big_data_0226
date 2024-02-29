package 연습문제_상근날드;

import java.util.Scanner;

//햄버거 3가지종류
//음료 2가지종류
//햄버거 3가지중 가장 싼거, 음료 2가지중 가장 싼거 가격을 선택하고
//세트 메뉴 이므로 50원 할인해서 금액 제시
// 1차원 배열 사용하는 문제
public class BurgerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] buger = new int[3];
        int[] beverage = new int[2];

        for (int i = 0; i < buger.length; i++) {
            buger[i] = sc.nextInt();
        }
        int bugerMin = buger[0]; // 기준점을 잡아줘야 비교가능, 입력을 받은 후에 선언해줘야 값을 이해함

        for (int i = 0; i < buger.length; i++) {
            if (bugerMin > buger[i]) bugerMin = buger[i];
        }

        for (int j = 0; j < beverage.length; j++) {
            beverage[j] = sc.nextInt();
        }
        int beverageMin = beverage[0];

        for (int j = 0; j < beverage.length; j++) {
            if (beverageMin > beverage[j]) beverageMin = beverage[j];
        }

        System.out.println(bugerMin + beverageMin - 50);
    }
}

