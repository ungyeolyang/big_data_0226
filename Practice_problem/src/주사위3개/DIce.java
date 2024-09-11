package 주사위3개;

import java.util.Scanner;

public class DIce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x==y && y==z){
            System.out.println(10000+x*1000);
        }else if(x==y||x==z){
            System.out.println(1000+x*100);
        }else if(y==z){
            System.out.println(1000+y*100);  
        }else{
            System.out.println(Math.max(Math.max(x,y),z)*100);
        }
    }
}
