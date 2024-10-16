package 성지키기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Castle {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int[] row  = new int[x];
        int[] column  = new int[y];
        int rows = 0;
        int columns = 0;
        for(int i =0; i < x; i++){
            String string = bf.readLine();
            for(int j =0; j<y; j++){
                if(string.charAt(j) == 'X'){
                 row[i] = 1;
                 column[j] = 1;
                }
            }
        }
        for(int i: row){
            rows += i;
        }
        for(int i: column){
            columns += i;
        }
        System.out.println(Math.max(x-rows,y-columns));
    }
}
