package 나누기;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int y = sc.nextInt();
        long sum = (x / 100) * 100;

        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((sum + i) % y == 0) {
                result = i;
                break;
            }
        }
        System.out.printf("%02d\n", result);
    }
}
