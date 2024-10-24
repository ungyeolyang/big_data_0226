package 암호키;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            boolean check = false;
            String x = br.readLine();
            long input = Long.parseLong(x);
            for(int j = 2; j< 1000000; j++){
                if(input % j == 0){check = true; break;}
            }
            if(check){sb.append("NO\n");}
            else sb.append("YES\n");
        }
        System.out.print(sb);
    }
}
