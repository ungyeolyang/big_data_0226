package 유진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Newjeans {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String result = "Yes";
        input = input.replace("1","");
        input = input.replace("4","22");
        input = input.replace("6","23");
        input = input.replace("8","222");
        input = input.replace("9","33");
        String[] num = {"2","3","5","7"};
        if(input.isEmpty()){System.out.println("NO"); return;}
        String left = input.substring(0,input.length()/2);
        String right = input.substring(input.length()/2);
        if(left.length() != right.length()){System.out.println("NO"); return;}
        for(int i = 0; i<4; i++){
            int x = left.replace(num[i],"").length();
            int y = left.replace(num[i],"").length();
            if(x != y){result = "NO"; break;}
            }
        System.out.println(result);
    }
}
