package 기상청인턴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Meteological {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        String[] input = br.readLine().split(" ");
        System.out.print(Max(num, input));
    }
    private static int Max(String[] x, String[] y){
        int size = Integer.parseInt(x[0]);
        int con = Integer.parseInt(x[1]);
        int max = 0;
        for(int i = 0; i < con; i++){
            max += Integer.parseInt(y[i]);
        }
        int sum = max;
        for(int i = con; i < size; i++){
            sum = sum - Integer.parseInt(y[i-con]) + Integer.parseInt(y[i]);
            max = Math.max(max,sum);
        }
        return max;
    }
}
