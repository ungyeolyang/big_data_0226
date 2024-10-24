package 암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int lenght = input.length()/num;
        int i = 0;
        int j = 0;
        int index = 0;
        int count = 0;
        char[] result = new char[input.length()];
        while (true){
            if(i == lenght){break;}
            result[index] = input.charAt(j);
            j++;
            count++;
            if(count == num){count = 0; i++; index++;}
            else if(i%2 == 0){index += lenght;}
            else index -= lenght;
        }
        System.out.print(result);
    }
}
