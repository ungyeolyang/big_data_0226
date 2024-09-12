package 별찍기;

import java.util.Scanner;

public class Star8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i<input; i++){
            System.out.println(" ".repeat(i)+"*".repeat(2*(input-1-i)+1));
        }
        for(int i = 0; i<input-1; i++){
            System.out.println(" ".repeat(input-i-2)+"*".repeat(2*(i+1)+1));
        }
    }
}
