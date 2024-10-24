package 진수변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int length = input.length();
        String result =input.length() % 3 == 0 ? input : "0".repeat(3-(length % 3)) + input;
        String oct = null;
        for(int i = 0; i< result.length()/3; i++){
            oct = result.substring(0+3*i,3+3*i);
            sb.append(Integer.parseInt(oct,2));
        }
        System.out.println(sb);
    }
}
