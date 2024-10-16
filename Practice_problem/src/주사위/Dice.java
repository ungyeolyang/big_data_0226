package 주사위;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Dice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int z1 = z;
        int y1 = y;
        int x1 = x;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int value = 0;
        while (true){
            value = map.get(x+y+z) != null ? map.get(x+y+z)+1 :1;
            map.put(x+y+z,value);
            if(x==1 && y==1 && z==1){break;}
            if(y==1 && z==1){
                x -=1;
                y = y1;
                z = z1;
                continue;
            }
            else if(z==1){
                y -=1;
                z = z1;
                continue;
            }
            z--;
        }
        int num = 0;
        int max = 0;
        for(int i : map.keySet()){
            if(num < map.get(i)){
                num = map.get(i);
                max = i;
            }
        }
        System.out.println(max);
    }
}
