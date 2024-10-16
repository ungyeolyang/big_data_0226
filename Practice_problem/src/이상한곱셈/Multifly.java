package 이상한곱셈;

import java.util.Scanner;

public class Multifly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        int sizex = x.length();
        int sizey = y.length();
        long sum = 0;
        for(int i = 0; i<sizex; i++){
            int x1 = x.charAt(i)-'0';
            for(int j = 0; j< sizey; j++){
                int y1 = y.charAt(j)-'0';
                sum += x1 * y1;
            }
        }
        System.out.println(sum);
    }
}
