package 연습문제_요금제;

import java.util.Scanner;

//영식 10 + /30 * 10
//민식 15 + /60 * 15
//통화 횟수 <= 20
//time>= 0 && time<=10000

public class MobilePay {
    public static void main(String[] args) {

//         int[] call = new int[20]; // 총 통화 횟수
//         int yPay =0, mPay = 0 //각각의 요금제에 총 요금 누적하는 변수;
//         Scanner sc = new Scanner(System.in);
//         int cnt = sc.nextInt(); // 통화 횟수 입력
//         for(int i = 0; i < cnt; i++) {
//         call[i] =sc.nextInt();
//         }
//         for(int i = 0; i < cnt; i++){
//          yPay += 10 + (call[i]/30) * 10
//         mPay += 15 + (call[i]/60) * 15
//          }
//         if(yPay == mPay) System.out.println("YM "+ yPay);
//        else if(yPay > mPay) System.out.println("M "+ mPay);
//        else System.out.println("Y "+ yPay);

        Scanner sc = new Scanner(System.in);
        int sumY = 0;
        int sumM = 0;
        int n;

        System.out.println("통화 횟수를 입력하세요.");
        while (true) {
            n = sc.nextInt();
            if (n > 0 && n < 21) break;
            else System.out.println("잘못된 입력입니다. 다시입력하세요.");
        }

        int[] time = new int[n];
        int call;

        System.out.println("통화 시간을 입력하세요.");
        for (int i = 0; i < n; i++) {
            while(true) {
                call = sc.nextInt();
                if(call >= 0 && call <= 10000) {
                    time[i] = call;
                    break;
                }
                    else System.out.println("잘못된 입력입니다. 다시입력하세요.");
                }
            }

        for (int i = 0; i < time.length; i++) {
            sumY += MinYong.y(time[i]);
            sumM += MinYong.m(time[i]);
        }
        if(sumY == sumM) System.out.println("YM "+sumY);
        else if(sumY > sumM) System.out.println("M "+sumM);
        else System.out.println("Y "+sumY);


    }
}
    class MinYong {
        static int y(int num) {
            return (10 + num / 30 * 10);
        }

        static int m(int num) {
            return 15 + num / 60 * 15;
        }
    }

