package 대부분의약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Measure {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int[] x = new int[5];
        for(int i = 0; i <5; i++){
            x[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(x);
        int val = x[0];
        while (true){
            int count =0;
            if(val%x[0] == 0){count++;}
            if(val%x[1] == 0){count++;}
            if(val%x[2] == 0){count++;}
            if(val%x[3] == 0){count++;}
            if(val%x[4] == 0){count++;}
            if(count == 3){System.out.println(val); break;}
            val++;
        }
    }
}
