package 연습문제_전자레인지;

import java.util.Scanner;

// a 5분
// b 1분
// c 10초
// t 초에 버튼 최소
public class Microwave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] time = new int[3];
        time[0] = num/300;
        time[1] = (num%300)/60;
        time[2] = (num%60/10);
        if(num%10 == 0){
            for(int i = 0; i<time.length; i++)
                System.out.print(time[i] +" ");
        }
        else System.out.println("-1");
    }
}
