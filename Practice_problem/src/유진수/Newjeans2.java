package 유진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Newjeans2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int[] num = new int[input.length];
        int mid = 0;
        long leftsum , rightsum;
        for(int i = 0; i<input.length; i++){
            num[i] = input[i]-'0';
        }
        for(int j = 0; j<num.length; j++){
            leftsum = 1; rightsum = 1;
            for(int i = 0; i < mid; i++){
                leftsum *= num[i];
            }
            for(int i = mid; i<input.length; i++){
                rightsum *= num[i];
            }
            if(input.length != 1 && leftsum == rightsum){System.out.println("YES"); return;}
            mid++;
        }
        System.out.println("NO");
    }
}
