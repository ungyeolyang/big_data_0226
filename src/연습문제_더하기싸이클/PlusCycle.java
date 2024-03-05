package 연습문제_더하기싸이클;

import java.util.Scanner;

public class PlusCycle {
    // 0부터 99 까지의 정수 입력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while(true) {
            System.out.println("정수를 입력하세요.");
             num = sc.nextInt();
            if(num>=0 && num<=99) break;
        }

        if (num < 10) num += 10;
        int n = num;
        int count=0;

        while (true) {
            n = (n % 10 * 10) + ((n / 10 + n % 10) % 10);
            count++;
            if (num == n) {
                System.out.println(count);
                break;
            }
        }
    }
}
