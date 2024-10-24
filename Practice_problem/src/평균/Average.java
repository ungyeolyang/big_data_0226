package 평균;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int sum = 0;
        int max = 0;
        int compare = 0;
        for(int i = 0; i<input.length; i++){
            compare = Integer.parseInt(input[i]);
            sum += compare;
            if(max < compare){max = compare;}
        }
        System.out.println(((double)sum/max * 100)/num);
    }
}
