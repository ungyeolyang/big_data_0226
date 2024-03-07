package 연습문제_단어찾기;

import java.util.Scanner;
//정수를 입력받고
//대소문자 상관안하고
//제일 많이쓴 문자 찾기
public class Spell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        //int[] alphabet = new int[26]; // 알파벳 개수만큼 배열 생성
        //int max = 0; // 가장 많이 등장하는 단어의 수를 저장하는 변수
        //char result = 0; // 출력할 단어
        //for(int i = 0; i< input.length(); i++){
        // if(Word.charAt(i) >= 'a') alphabet[input.charAt(i) - 'a']++;// 소문자로 들어온경우, 숫자로 변경
        //  else alphabet[input.charAt(i)-'A']++; // 대문자가 들어온경우, 숫자로변경
        //}
        //for(int i = 0; i < alphabet.length; i++){
        //  if(alphabet[i] == max) result ='?');
        //  else if(alphabet[i] > max){
        //  max = alphabet[i];
        //  result = (char)('A'+i);} // 다 대문자로 바꿔놨으니 A + 0은 A 출력
        //  }
        // System.out.println(result);



        boolean isSame = false;

        int cnt = 1;
        char[] num = input.toCharArray();
        int[] num1 = new int[num.length];

        for(int i = 0; i<num.length; i++){
            if(num[i]>='a' && num[i]<='z') num[i] -= ('a'-'A');
            if(num[i] == 0) continue;
            for(int j = i+1; j<num.length;j++){
                if(num[j]>='a' && num[j]<='z') num[j] -= ('a'-'A');
                if(num[i] == num[j]) {num[j] = 0; cnt++;}
            }
            num1[i] = cnt;
            cnt = 0;
        }

        //최고값 찾기
        int index = 0;
        for (int i = 1; i < num1.length; i++) {
                if(num[i] == 0);
                else if(num1[index] == num1[i]) isSame = true;
                else if(num1[index] < num1[i]) {
                    index = i;
                    isSame = false;
                }
        }

        if(isSame) System.out.println("?");
        else System.out.println(num[index]);

    }
}
