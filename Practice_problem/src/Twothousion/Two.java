package Twothousion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args) throws IOException {
        String[] date = {"SUN","MON","TUE","WEN","THU","FRI","SAT"};
        int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int sum = 0;
        for(int i = 0; i < m-1; i++){
            sum+=day[i];
        }
        sum+=d;
        System.out.print(date[sum%7]);
    }
}
