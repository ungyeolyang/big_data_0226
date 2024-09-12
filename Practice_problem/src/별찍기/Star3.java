package 별찍기;

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i<input;i++ ){
            System.out.println(" ".repeat(i)+"*".repeat(input-i));
        }
    }
}
