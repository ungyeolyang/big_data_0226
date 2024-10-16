package 진짜공간;

import java.util.Scanner;
public class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] y = new int[x];
        for(int i = 0; i<x; i++){
            y[i] = sc.nextInt();
        }
        int z = sc.nextInt();
        long sum = 0;
        for(int i = 0; i<x; i++){
            sum += (long) (Math.ceil((double) y[i] /z) * z);
        }
        System.out.println(sum);
    }
}
