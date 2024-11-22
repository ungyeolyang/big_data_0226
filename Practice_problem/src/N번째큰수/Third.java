package N번째큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            String[] input = br.readLine().split(" ");
            int[] x =new int[input.length];
            for(int j = 0; j<input.length; j++){
                x[j] =Integer.parseInt(input[j]);
            }
            Arrays.sort(x);
            sb.append(x[7]).append("\n");
        }
        System.out.print(sb);
    }
}
