package TV크기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TV {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        double q2 = Math.pow(x,2)/(Math.pow(y,2)+Math.pow(z,2));
        int d = (int) Math.floor(Math.sqrt(q2)* y) ;
        int h = (int) Math.floor(Math.sqrt(q2)* z) ;
        System.out.println(d+" "+h);
    }
}
