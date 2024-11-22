package 부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< num; i++){
            int sum = 0;
            int floor = Integer.parseInt(br.readLine());
            int house = Integer.parseInt(br.readLine());
            for(int j = 0; j < house; j++){
                sum += j+floor;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
