package 펠린드롬수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String input = bf.readLine();
            String result = "yes";
            if(input.equals("0")){break;}
            for(int i = 0; i<Math.floor((double) input.length() /2); i++){
                if(input.charAt(i) != input.charAt(input.length()-1-i)){
                    result = "no";
                    break;
                }
            }
            sb.append(result);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
