package 이번학기평점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Map<String,Double> map = new HashMap<>();
        int total = 0;
        double sum = 0.0;
        map.put("A+",4.3);
        map.put("A0",4.0);
        map.put("A-",3.7);
        map.put("B+",3.3);
        map.put("B0",3.0);
        map.put("B-",2.7);
        map.put("C+",2.3);
        map.put("C0",2.0);
        map.put("C-",1.7);
        map.put("D+",1.3);
        map.put("D0",1.0);
        map.put("D-",0.7);
        map.put("F",0.0);
        for(int i = 0; i< num; i++){
            String[] input = br.readLine().split(" ");
            int credit = Integer.parseInt(input[1]);
            sum += credit*map.get(input[2]);
            total += credit;
        }
        System.out.print(String.format("%.2f",sum/total));
    }
}
