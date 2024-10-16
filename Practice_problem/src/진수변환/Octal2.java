package 진수변환;

import java.util.Scanner;

public class Octal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder sb = new StringBuilder();
        String[] bi = {"000","001","010","011","100","101","110","111"};
        System.out.print(Integer.toBinaryString(input.charAt(0)-'0'));
        for(int i =1; i<input.length(); i++){
         sb.append(bi[input.charAt(i)-'0']);
        }
        System.out.println(sb);
    }
}
