package 동전게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new TreeMap<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< num; i++){
            map.clear();
            map.put("TTT",0);
            map.put("TTH",0);
            map.put("THT",0);
            map.put("THH",0);
            map.put("HTT",0);
            map.put("HTH",0);
            map.put("HHT",0);
            map.put("HHH",0);
            char[] input = br.readLine().toCharArray();
            for(int j = 0; j<input.length-2; j++){
                String x =""+input[j]+input[j+1]+input[j+2];
                map.put(x,map.getOrDefault(x,0)+1);
            }
            for(String key:map.keySet()){
                sb.append(map.get(key)).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
