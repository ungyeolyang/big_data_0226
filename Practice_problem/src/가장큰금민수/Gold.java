package 가장큰금민수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        int result = 0;
        while (true){
            result += (int) (7 * Math.pow(10,input.length()-1));

        }
    }
}
