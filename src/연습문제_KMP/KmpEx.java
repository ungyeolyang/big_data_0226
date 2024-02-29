package 연습문제_KMP;

import java.util.Scanner;

//Elastic-Search = ES
public class KmpEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split("-");
        for(String e : b){
            System.out.print(e.trim().charAt(0));
        }
        System.out.println();

        char[] c = a.toCharArray(); // 안나누고 그냥 charAt으로 풀어도됨
        for(int i = 0; i < c.length; i++){
            if(i == 0) System.out.print(c[i]);
            else if(c[i] == '-') System.out.print(c[i+1]);
        }
        System.out.println();

        for(int i = 0; i < c.length; i++){
            if(c[i] >= 'A' && c[i] <='Z') System.out.print(c[i]);
        }
        System.out.println();

        String d = a;
        System.out.print(d.charAt(0));
        while (d.contains("-")){
            System.out.print(d.charAt(d.indexOf("-") + 1));
            d = d.substring((d.indexOf("-") + 1));
        }


    }
}
