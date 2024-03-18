package 소수단어;
//'a'(97) 1 ~  -96
//'A'(65) 27 ~ -38
// 입력받은 단어의 합이 소수이면 소수, 아니면 소수가 아니라고 출력

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int sum = 0;
        String sentence = sc.next();
        char[] sentences = sentence.toCharArray();

        for(int i = 0; i <sentences.length; i++){
            if(sentences[i] >= 'a' && sentences[i] <= 'z') sum += (sentences[i]-96); // (sentences[i] - 'a' + 1)
            else sum += (sentences[i]-38); // (sentences[i] - 'A' + 27)
        }

        for(int j = 2; j < sum; j++){
            if (sum % j == 0) {isPrime = false; break;}
        }

        if(!isPrime) System.out.println("소수가 아닙니다.");
        else System.out.println("소수 입니다.");
    }
}
