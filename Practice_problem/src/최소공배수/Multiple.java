package 최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Multiple {
    public static Map<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            map.clear();
            int sum = 1;
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            multi(x);
            multi(y);
            for(int j : map.keySet()){
                sum *= (int) Math.pow(j,map.get(j));
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
    public static void multi(int x){
            int num = 2;
            while(x > 1){
                int count = 0;
                while(x%num == 0) {
                    x = x/num;
                    count++;
                }
                if(count>0) {
                    map.put(num,Math.max(map.getOrDefault(num,0),count) );
                }
                    num++;
                }
            }
    }

