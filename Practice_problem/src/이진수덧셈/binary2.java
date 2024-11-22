package 이진수덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class binary2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            String y = st.nextToken();

            BigInteger x1 = new BigInteger(x, 2);
            BigInteger y1 = new BigInteger(y, 2);

            BigInteger sum = x1.add(y1);

            sb.append(sum.toString(2)).append("\n");
        }
        System.out.print(sb);
    }
}
