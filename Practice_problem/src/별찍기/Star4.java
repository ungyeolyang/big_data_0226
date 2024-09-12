package 별찍기;

import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i < input; i++){
            System.out.println(" ".repeat(input-i-1)+"*".repeat(2*i+1));
        }
    }
}
