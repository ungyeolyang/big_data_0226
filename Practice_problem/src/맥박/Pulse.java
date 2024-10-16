package 맥박;

import java.util.Scanner;

public class Pulse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = sc.nextInt();
        int low = sc.nextInt();
        int high =sc.nextInt();
        int pulse = sc.nextInt();
        int decrease = sc.nextInt();
        int count = 0;
        int start = low;
        while (true){
            if(low+pulse>high){System.out.println(-1); break;}
            if(goal==0){System.out.println(count); break;}
            if(start + pulse > high){ start -= decrease; count++;}
            else if(start<low){start = low;}
            else {start+=pulse;count++;goal--;}
        }
    }
}
