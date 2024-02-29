package 연습문제_반목문;

import java.util.Scanner;

// 임의의 정수 n을 입력하여 nxn 행령을 출력 하는 프로그램 작성
// ex) 3
// 1 2 3
// 4 5 6
// 7 8 9
public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                sum++;
                System.out.printf("%3d",sum);
            }
            System.out.println();
        }

//        for (int i = 0; i <= n*n; i++) {
//            System.out.printf("%3d", i);
//            if (i % n == 0) System.out.println();
//        }
    }
}
