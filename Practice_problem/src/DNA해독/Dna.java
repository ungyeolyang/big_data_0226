package DNA해독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dna {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        char result = input.charAt(input.length()-1);
        for(int i = 0; i< num-1; i++){
            char first = input.charAt(input.length()-2-i);
            String compare = "" + first + result;
            switch (compare) {
                case "AA": case "AC": case "CA": case "GT": case "TG":
                    result = 'A'; break;
                case "GG": case "AT": case "TA": case "TC": case "CT":
                    result = 'G'; break;
                case "CC": case "AG": case "GA":
                    result = 'C'; break;
                case "TT": case "CG": case "GC":
                    result = 'T'; break;
            }
        }
        System.out.print(result);
    }
}
