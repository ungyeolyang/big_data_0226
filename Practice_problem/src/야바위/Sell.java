package 야바위;

import java.util.Scanner;

public class Sell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ball = 1;
        for(int i = 0; i< input; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == ball){
                ball = y;
            } else if(y == ball){
                ball = x;
            }
        }
        System.out.println(ball);
    }
}
