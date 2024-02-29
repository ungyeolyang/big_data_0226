package 연습문제_대소문자바꾸기;

import java.util.Scanner;

public class UpperLowerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String intput = sc.next();
//        for(int i = 0; i < intput.length(); i++){
//            char ch = intput.charAt(i);
//            if(ch < 'a') System.out.print((char)(ch + ('a'-'A')));
//            else System.out.print((char)(ch - ('a'-'A')));
//        }

        String a = sc.nextLine();
        char b[] = a.toCharArray();

        for(int i = 0; i < b.length; i++){
           if (b[i] >= 'A' && b[i] <='Z') b[i] += ('a'-'A');
           else if (b[i] >= 'a' && b[i] <='z') b[i] -= ('a'-'A');
        }

        for (char e : b){
            System.out.print((char)e);
        }
    }
}
