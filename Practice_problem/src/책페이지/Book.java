package 책페이지;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] page = new int[10];
        for(int i =1; i<=input; i++){
            String string = Integer.toString(i);
            int x = string.length();
            for(int j = 0; j<10; j++){
                int y = string.replace(Integer.toString(j),"").length();
                page[j] += x-y;
            }
        }
        for(int i: page){
            System.out.print(i+" ");
        }
    }
}
