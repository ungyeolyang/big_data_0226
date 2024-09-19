package 직사각형탈출;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.min(Math.min(x,y),Math.min(a-x,b-y)));
    }
}
