package 연습문제_유클리드호제법;

import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r , s, r1;
        r = Math.max(a,b) % Math.min(a,b);
        s = Math.min(a,b);


        while(true){
            r1 = s % r;
            s = r;
            r = r1;
            if (s % r == 0) { System.out.println(r); break;};
        }
    }
}
