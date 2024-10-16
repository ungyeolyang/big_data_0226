package 명령프롬프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cmd {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String x = bf.readLine();
        char[] result = x.toCharArray();
        for (int i = 0; i<num-1; i++){
            String y = bf.readLine();
            for(int j =0; j < result.length; j++){
                if(result[j]!=y.charAt(j)){
                    result[j] = '?';
                }
            }
        }
        System.out.println(result);
    }
}
