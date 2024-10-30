package 오르막길;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uphill {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int start = 0;
        int end = 0;
        int max = 0;
        for(int i = 0; i < num-1; i++){
            int x = Integer.parseInt(input[i]);
            int y = Integer.parseInt(input[i+1]);
            if( x < y){
                if(start == 0) {
                    start = x;
                }
                end = y;
                if(max < end-start){ max = end-start;}
            } else {
                start = 0;
                end = 0;
            }
        }
        System.out.print(max);
    }
}
