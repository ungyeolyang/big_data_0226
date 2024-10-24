package 수열의변화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int x = Integer.parseInt(num[0]);
        int y = Integer.parseInt(num[1]);
        int[] input = new int[x];
        String[] arrays = br.readLine().split(",");
        for(int i = 0; i< input.length; i++){
            input[i] = Integer.parseInt(arrays[i]);
        }
        for(int i = 0; i< y; i++){
            int[] copy = input;
            input = new int[input.length-1];
            for(int j = 0; j < input.length; j++){
                input[j] = copy[j+1] - copy[j];
            }
        }
        for(int i = 0; i< input.length; i++){
            System.out.print(input[i]);
            if(i<input.length-1){
                System.out.print(",");
            }
        }
    }
}
