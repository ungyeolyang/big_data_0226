package 컵홀더;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Holder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int s = num - input.replace("S","").length();
        int l = num - input.replace("L","").length();
        if(num>s+l/2+1) {System.out.print(s+l/2+1);}
        else System.out.print(num);
    }
}
