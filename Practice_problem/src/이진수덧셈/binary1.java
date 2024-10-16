package 이진수덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class binary1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String x = st.nextToken();
        String y = st.nextToken();
        int x1 = 0;
        int y1 = 0;
        for(int i = 0; i< x.length(); i++){
            x1 = (x1 * 2) + (x.charAt(i)-'0');
        }
        for(int j = 0; j< y.length(); j++){
            y1 = (y1 * 2) + (y.charAt(j)-'0');
        }
        int sum = x1 + y1;
        System.out.println(Integer.toBinaryString(sum));
    }
}
