package 분산처리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dispersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 1;
            for(int j = 0; j < y; j++){
                sum = (sum * (x%10))%10;
                if(sum==0){sum=10;}
            }
            list.add(sum);
        }
        for(int i:list){
            System.out.println(i);
        }
    }
}
