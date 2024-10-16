package 단어공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Word {
     public static void main(String[] args) throws IOException {
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         String input = bf.readLine().toUpperCase();
         Map<Character,Integer> map = new HashMap<>();
         Character result = '?';
         for(int i =0; i<input.length(); i++ ){
             char ch = input.charAt(i);
             map.put(ch,map.getOrDefault(ch,0)+1);
         }
         int max = 0;
         for(char ch: map.keySet()){
             int i = map.get(ch);
             if(i>max){
                 result = ch;
                 max = i;
             } else if (i == max) {
                 result = '?';
             }
         }
        System.out.println(result);
    }
}
