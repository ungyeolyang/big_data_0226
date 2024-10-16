package 진수변환;

import java.util.Scanner;

public class Octal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.print(Integer.toBinaryString(input.charAt(0)-'0'));
        for(int i =1; i< input.length(); i++){
            System.out.printf("%03d",Integer.parseInt(Integer.toBinaryString(input.charAt(i)-'0')));
        }
    }
}
