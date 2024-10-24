package 유진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Newjeans1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        if(input.length() == 1){System.out.println("NO"); return;}
        String result = "YES";
        input = input.replace("1","");
        String[] x = new String[input.length()];
        for(int i = 0; i<x.length; i++){
            Character ch = input.charAt(i);
            String y = null;
            switch (ch){
                case '4': y = "22"; break;
                case '6': y = "23"; break;
                case '8': y = "222"; break;
                case '9': y = "33"; break;
                default: y =String.valueOf(ch);
            }
            x[i] = y;
        }
        StringBuilder left = new StringBuilder(x[0]);
        StringBuilder right = new StringBuilder(x[x.length-1]);
        int l = 1;
        int r = 1;
        while (l <= x.length - 1 - r) {
            if (left.length() < right.length()) {
                left.append(x[l]);
                l++;
            } else {
                right.append(x[x.length - 1 - r]);
                r++;
            }
        }
        String left1 = left.toString();
        String right1 = right.toString();
        if(left1.equals("0")||right1.equals("0")){System.out.println("NO");return;}
        String[] num = {"2","3","5","7"};
        if(left.length() != right.length()){System.out.println("NO"); return;}
        for(int i = 0; i<4; i++){
            int xl = left1.replace(num[i],"").length();
            int yl = right1.replace(num[i],"").length();
            if(xl != yl){result = "NO"; break;}
        }
        System.out.println(result);
    }
}
