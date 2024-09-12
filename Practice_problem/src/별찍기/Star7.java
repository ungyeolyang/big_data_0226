package 별찍기;

import java.util.Scanner;

public class Star7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i < input; i++){
            System.out.println("*".repeat(i+1)+" ".repeat(2*(input-i-1))+"*".repeat(i+1));
        }
        for(int i = 0; i < input-1; i++){
            System.out.println("*".repeat(input-1-i)+" ".repeat(2*(i+1))+"*".repeat(input-1-i));
        }
    }
}
