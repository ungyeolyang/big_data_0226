package 나머지와몫이같은수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long i = 1;
        long sum = 0;
        while (true){
            if(i*num+i >= Math.pow(num,2)){break;}
            sum += i*num+i;
            i++;
        }
        System.out.print(sum);
    }
}
