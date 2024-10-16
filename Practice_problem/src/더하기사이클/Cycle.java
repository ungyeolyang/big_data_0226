package 더하기사이클;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int compare = num;
        int count = 1;
        while (true){
            num = num%10*10+(num/10+num%10)%10;
            if(num == compare){System.out.println(count); break;}
            count++;
        }
    }
}
