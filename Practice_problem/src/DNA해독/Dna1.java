package DNA해독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dna1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringBuilder sb= new StringBuilder(input);
        Character[][] dna = {{0,2,0,1},{2,1,3,0},{0,3,2,1},{1,0,1,3}};
        
    }
}
