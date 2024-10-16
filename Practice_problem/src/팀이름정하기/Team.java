package 팀이름정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int length = name.length();
        String love = "LOVE";
        TreeSet<String> set = new TreeSet<>();
        int[] loves = new int[4];
        for(int i = 0; i<4; i++){
            String input = name.replace(String.valueOf(love.charAt(i)),"");
            loves[i] = length-input.length();
        }
        int num = Integer.parseInt(bf.readLine());
        int[] xs = new int[4];
        int max = 0;
        for(int j = 0; j<num; j++){
            String x = bf.readLine();
            for(int i = 0; i<4; i++){
                String input = x.replace(String.valueOf(love.charAt(i)),"");
                xs[i] = x.length()-input.length() + loves[i];
            }
            if(((xs[0]+xs[1])*(xs[0]+xs[2])*(xs[0]+xs[3])*(xs[1]+xs[2])*(xs[1]+xs[3])*(xs[2]+xs[3]))%100>max){
                max = ((xs[0]+xs[1])*(xs[0]+xs[2])*(xs[0]+xs[3])*(xs[1]+xs[2])*(xs[1]+xs[3])*(xs[2]+xs[3]))%100;
                set.clear();
                set.add(x);
            } else if(((xs[0]+xs[1])*(xs[0]+xs[2])*(xs[0]+xs[3])*(xs[1]+xs[2])*(xs[1]+xs[3])*(xs[2]+xs[3]))%100 == max){
                set.add(x);
            }
        }
        System.out.println(set.first());
    }
}
