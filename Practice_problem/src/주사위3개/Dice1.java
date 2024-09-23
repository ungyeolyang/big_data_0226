package 주사위3개;

import java.util.Scanner;

public class Dice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        for(int i =0; i<num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x==y && y==z){
                if(max < 10000+x*1000){max = 10000+x*1000;}
            }else if(x==y||x==z){
                if(max < 1000+x*100){max = 1000+x*100;}
            }else if(y==z){
                if(max < 1000+y*100){max = 1000+y*100;}
            }else{
                if(max<Math.max(Math.max(x,y),z)*100){max = Math.max(Math.max(x,y),z)*100;}
            }
        }
        System.out.println(max);
    }
}
