package 디지털시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digital {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<3; i++){
            String[] input = br.readLine().split(" ");
            String[] start = input[0].split(":");
            int[] stnum = new int[3];
            for(int j = 0; j<3; j++){
                stnum[j] = Integer.parseInt(start[j]);
            }
            int st = (int) (stnum[0]*Math.pow(10,4)+stnum[1]*Math.pow(10,2)+stnum[2]);
            int s = stnum[0]*60*60 + stnum[1]*60 + stnum[2];
            int en = Integer.parseInt(input[1].replace(":",""));
            int count = 0;
            while(true){
                if(st%3 == 0){count++;}
                if(st == en){sb.append(count+"\n"); break;}
                s++;
                stnum[2] = s%60;
                stnum[1] = s%3600/60;
                stnum[0] = s/3600%24;
                st = (int) (stnum[0]*Math.pow(10,4)+stnum[1]*Math.pow(10,2)+stnum[2]);
            }
        }
        System.out.print(sb);
    }
}
