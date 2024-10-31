package 디지털티비;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class DIgital {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int k1 = 0;
        int k2 = 0;
        for(int i = 0; i < num; i++){
            String input = br.readLine();
            if(Objects.equals(input, "KBS1")){k1 = i;}
            if(Objects.equals(input, "KBS2")){k2 = i;}
        }
        if(k2 < k1){k2 += 1;}
        System.out.print("1".repeat(k1)+"4".repeat(k1)+"1".repeat(k2)+"4".repeat(k2-1));
    }
}
