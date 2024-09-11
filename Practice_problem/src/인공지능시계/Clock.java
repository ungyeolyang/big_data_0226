package 인공지능시계;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = sc.nextInt();
        int sum = x*60*60+ y*60 + z + a;
        int hour = sum/3600 % 24;
        int minute = sum%3600/60;
        int second = sum%60;
        System.out.println(hour+" "+minute+" "+second);
    }
}
