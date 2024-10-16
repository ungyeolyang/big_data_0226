package 세준세비;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x =Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< x; i++){
            if(bf.readLine().isEmpty()){}
            String[] st = bf.readLine().split(" ");
            int s = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            String[] sm = bf.readLine().split(" ");
            String[] bm = bf.readLine().split(" ");
            long sp = 0;
            long bp = 0;
            for(int j = 0; j < s; j++){
                long s1 = Integer.parseInt(sm[j]);
                sp = Math.max(sp,s1);
            }
            for(int k = 0; k<b; k++){
                long b1 = Integer.parseInt(bm[k]);
                bp = Math.max(bp,b1);
            }
            if(sp<bp){sb.append('B'); sb.append('\n');}
            else {sb.append('S');sb.append('\n');}
        }
            System.out.println(sb);
    }
}