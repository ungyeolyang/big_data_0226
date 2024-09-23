package 기차탑승인원;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        for(int i = 0; i< 2*4; i++){
            if(i % 2==0){
                sum -= sc.nextInt();
            }else {sum += sc.nextInt();
                if(max<sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
