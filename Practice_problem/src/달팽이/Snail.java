package 달팽이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int column = Integer.parseInt(input[1]);
        int end = row*column;
        int count = 0;
        int x = 0;
        while(true){
            for(int i = 0; i < column-1; i++){x++;}
            if(x>=end-1){break;}
            count++;
            for(int i = 0; i < row-1; i++){x++;}
            if(x>=end-1){break;}
            count++;
            row--;
            for(int i = 0; i < column-1; i++){x++;}
            if(x>=end-1){break;}
            count++;
            column--;
            for(int i = 0; i < row-1; i++){x++;}
            if(x>=end-1){break;}
            count++;
        }
        System.out.print(count);
    }
}
