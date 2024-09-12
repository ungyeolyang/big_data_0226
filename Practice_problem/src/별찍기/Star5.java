package 별찍기;

import java.util.Scanner;

public class Star5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i< input;i++){
            System.out.println(" ".repeat(i) +"*".repeat(2*(input-i)-1));
        }
    }
}
