package 비밀편지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Secret {
    private static final Map<String, Character> CODE_MAP = new HashMap<>();

    static {
        String[] letter = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
        char[] word = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        for (int i = 0; i < letter.length; i++) {
            CODE_MAP.put(letter[i], word[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String compare = input.substring(i * 6, (i + 1) * 6);
            Character decodedChar = decode(compare);

            if (decodedChar == null) {
                System.out.print(i + 1);
                return;
            }
            sb.append(decodedChar);
        }
        System.out.print(sb);
    }

    private static Character decode(String compare) {
        for (Map.Entry<String, Character> entry : CODE_MAP.entrySet()) {
            String key = entry.getKey();
            int matchCount = 0;
            for (int i = 0; i < 6; i++) {
                if (key.charAt(i) == compare.charAt(i)) {
                    matchCount++;
                }
            }
            if (matchCount >= 5) {
                return entry.getValue();
            }
        }
        return null;
    }
}
