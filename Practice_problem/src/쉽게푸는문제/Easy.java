package 쉽게푸는문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[1275];
        int count = 0;
        for(int i = 1; i <= 50; i++){
            for(int j = 0; j < i; j++){
                num[count] = i;
                count++;
            }
        }
        String[] input = bf.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int sum = 0;
        for(int i = x-1; i < y; i++){
            sum += num[i];
        }
        System.out.println(sum);
    }
}
