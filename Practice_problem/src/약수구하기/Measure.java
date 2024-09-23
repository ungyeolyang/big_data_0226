package 약수구하기;

import java.util.Scanner;

public class Measure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
                if (count == y) {
                    System.out.println(i);
                    break;
                }
            }
            if (count < y) System.out.println(0);
        }
    }
}
