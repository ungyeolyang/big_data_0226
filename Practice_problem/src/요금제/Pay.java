package 요금제;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Ysum = 0;
        int Msum = 0;
        for(int i = 0; i < num; i++){
            int input = sc.nextInt();
            Ysum = Ysum + (input/30+1)*10;
            Msum = Msum + (input/60+1)*15;
        }
        if(Ysum == Msum){
            System.out.println("Y M "+Ysum);
        }else if(Math.min(Ysum,Msum) == Ysum){
            System.out.println("Y "+Ysum );
        } else {
            System.out.println("M "+Msum );
        }
    }
}
