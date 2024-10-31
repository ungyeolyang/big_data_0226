package 크로스워드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로스워드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String a = input[0];
        String b = input[1];
        int A = 0;
        int B = 0;
        boolean check = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            if(check){break;}
            for(int j = 0; j < b.length(); j++){
                if(a.charAt(i)==b.charAt(j)){A=i; B =j; check = true; break;}
            }
        }
        for(int i = 0; i < b.length(); i++){
            if(i==B){sb.append(a).append("\n");}
            else sb.append(".".repeat(A)).append(b.charAt(i)).append(".".repeat(a.length() - (A + 1))).append("\n");
        }
        System.out.print(sb);
    }
}

