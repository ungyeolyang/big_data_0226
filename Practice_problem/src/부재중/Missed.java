package 부재중;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Missed {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String[] input = bf.readLine().split(" ");
            int num = Integer.parseInt(input[0]);
            int length = Integer.parseInt(input[1]);
            int delay = Integer.parseInt(input[2]);
            int result = 0;
            for(int i = 0; i<num; i++){
                result += length;
                for(int j = 0; j<5; j++){
                    if(result%delay == 0){
                        System.out.println(result);
                        return;
                    }
                    result++;
                }
            }
            while (result%delay != 0){
                result ++;
            }
            System.out.println(result);
        }
    }