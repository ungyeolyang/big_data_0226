package 숫자의직선거리;

import java.util.Scanner;

public class Beeline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = Math.abs((x-1)/4 - (y-1)/4) + Math.abs((x-1)%4 - (y-1)%4);
        System.out.println(sum);
    }
}
