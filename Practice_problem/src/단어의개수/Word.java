package 단어의개수;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();
        String[] strings =  string.split(" ");
        int length = 0;
        if(!string.isEmpty()){length = strings.length;}
        System.out.println(length);
    }
}
