package 문자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Message {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        String z = br.readLine();
        String[] arr = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int count = 0;
        for(int i = 0; i< z.length()-1; i++){
            for(int j = 0; j < arr.length; j++){
                boolean a = arr[j].contains(""+z.charAt(i));
                boolean b = arr[j].contains(""+z.charAt(i+1));
                if(a&&b){count++;}
            }
        }
        System.out.print(2*z.length()+count*10);
    }
}
