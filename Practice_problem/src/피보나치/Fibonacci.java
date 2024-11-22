package 피보나치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.print(fibonacchi(num));
    }
    private static long fibonacchi(int n){
        long[] num = new long[100];
        num[0] = 0;
        num[1] = 1;
        for(int i = 1; i < n; i++){
            num[i+1] = num[i-1]+num[i];
        }
        return num[n];
    }
}
