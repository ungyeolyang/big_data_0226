package 경제학과;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Money {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            br.readLine();
            String[] cm = br.readLine().split(" ");
            String[] xm = br.readLine().split(" ");
            String[] ym = br.readLine().split(" ");
            System.out.print(count(cm,xm,ym));
        }
    }
    private static int count(String[] cm, String[] xm, String[] ym){
        int x = Integer.parseInt(cm[0]);
        int y = Integer.parseInt(cm[1]);
        int[] mx = new int[x];
        int[] my = new int[y];
        int count = 0;
        for(int i = 0; i<x; i++){
            int num = Integer.parseInt(xm[i]);
            mx[i] = num;
        }
        for(int i = 0; i<y; i++){
            int num = Integer.parseInt(ym[i]);
            my[i] = num;
        }
        OptionalDouble xavg = Arrays.stream(mx).average();
        OptionalDouble yavg = Arrays.stream(my).average();
        for(int i : mx){
            if(xavg.isPresent() && yavg.isPresent()){
                if( i <xavg.getAsDouble() && i>yavg.getAsDouble()){
                    count++;
                }
            }
        }
        return count;
    }
}
