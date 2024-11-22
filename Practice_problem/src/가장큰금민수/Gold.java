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
        for(int i = num; i>3; i--){
            if(gold(i)){
                result = i; break;
            }
        }
        System.out.println(result);
    }
    private static boolean gold(int i){
        int compare = i;
        while (true){
            int c = compare%10;
            if(c != 7 && c != 4){
                return false;
            }
            if(compare /10 == 0){break;}
            else compare /= 10;
        }
        return true;
    }
}
