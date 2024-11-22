package 싸이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Cycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        Set<Integer> set = new HashSet<>();
        int mod = x;
        while(true){
            int size = set.size();
            mod = (mod*x)%y;
            set.add(mod);
            if(size == set.size()){break;}
        }
        System.out.print(set.size());
    }
}
