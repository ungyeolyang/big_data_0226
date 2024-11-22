package 최대공약수최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class DM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int big = Math.max(x,y);
        int small = Math.min(x,y);
        int multi = big * small;
        int max = 0;
        int mod = 0;
        while (true){
            mod = big%small;
            if(mod == 0) {max = small; break;}
            big = small;
            small = mod;
        }
        System.out.println(max);
        System.out.println(multi/max);
    }
}
