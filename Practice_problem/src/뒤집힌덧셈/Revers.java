package 뒤집힌덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Revers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split(" ");
        char[] left = x[0].toCharArray();
        char[] right = x[1].toCharArray();
        int l = 0;
        int result = 0;
        for(int i = 0; i<left.length; i++){
            l += (int) (Integer.parseInt(String.valueOf(left[i])) * Math.pow(10,i));
        }
        for(int i = 0; i<right.length; i++){
            l += (int) (Integer.parseInt(String.valueOf(right[i])) * Math.pow(10,i));
        }
        char[] r = String.valueOf(l).toCharArray();
        for(int i = 0; i<r.length; i++){
            result += (int) (Integer.parseInt(String.valueOf(r[i])) * Math.pow(10,i));
        }
        System.out.println(result);
    }
}
