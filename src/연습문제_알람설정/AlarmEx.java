package 연습문제_알람설정;

import java.util.Scanner;

public class AlarmEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = 0;
        int min = 0;
        int cur = 0;
        while (true) {
            System.out.println("일어날 시간과 분을 입력하세요. ex)hh mm");
            hour = sc.nextInt();
            min = sc.nextInt();
            cur = (hour*60) + min;

            if (!(hour >= 0 && hour <= 23) || !(min >= 0 && min <= 59)) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
//
//            if(cur-45 < 0){
//                cur = (24*60) + min;
//            }
//            cur -=45;
//            System.out.println("설정해야할 알람 시간은" + cur/60 + ":" + cur%60 + " 입니다.");

            if (min - 45 < 0) {
                if(hour-1 < 0) hour = 23;
                else hour--;
                min = (min + 60) - 45;
            } else {
                min -= 45;
            }
            System.out.println("설정해야할 알람 시간은" + hour + ":" + min + " 입니다.");
            break;
        }
    }
}
