package 도비의난독증;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Dobby {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        while(true){
            int x = Integer.parseInt(br.readLine());
            if(x==0){break;}
            String first = br.readLine();
            set.add(first.toLowerCase());
            for(int i = 0; i < x-1; i++){
                String compare = br.readLine();
                set.add(compare.toLowerCase());
                if(!set.first().equalsIgnoreCase(first)){
                    first = compare;
                }
            }
            sb.append(first).append("\n");
        }
        System.out.print(sb);
    }
}
