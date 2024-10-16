package 약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Measure {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String[] input = bf.readLine().split(" ");
        int[] x = new int[num];
        for(int i = 0; i<x.length; i++){
            x[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(x);
        if(num == 1){
            System.out.println(x[0]*x[0]);
        } else {
            System.out.println(x[0]*x[num-1]);
        }
    }
}
