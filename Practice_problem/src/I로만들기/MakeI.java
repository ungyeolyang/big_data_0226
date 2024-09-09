package I로만들기;
//알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
// 알파벳 순서에서 "i"보다 앞서는 모든 문자를
// "i"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
public class MakeI {
    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
    }
    public static char[] solution(String str){
        char[] ch = str.toCharArray();
        for(int i = 0; i<str.length(); i++){
            if(ch[i] < 'i'){ ch[i] = 'i';
            }
        }
        return ch;
    }
}
