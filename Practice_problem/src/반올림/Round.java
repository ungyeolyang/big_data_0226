package 반올림;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = 0; i < input.length()-1; i++){
            if(input.charAt(input.length()-1-i)-'0'+carry >= 5 ){carry = 1;}
            else carry = 0;
        }
        sb.append(input.charAt(0)-'0'+carry).append("0".repeat(input.length()-1));
        System.out.print(sb);
    }
}
