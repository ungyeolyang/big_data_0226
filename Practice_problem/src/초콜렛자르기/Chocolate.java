package 초콜렛자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chocolate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        System.out.print((x-1)+x*(y-1));
    }
}
