package 네번째점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Point {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++){
            String[] input = br.readLine().split(" ");
            double[] x = new double[input.length];
            for(int j =  0; j < input.length; j++){
                x[j] = Double.parseDouble(input[j]);
            }
            sb.append(String.format("%.3f %.3f\n",x[6]-(x[2]-x[0]),x[7]-(x[3]-x[1])));
        }
        System.out.print(sb);
    }
}
