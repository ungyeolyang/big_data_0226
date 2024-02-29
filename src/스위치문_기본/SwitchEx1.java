package 스위치문_기본;

// if는 조건식이 사용될수 있지만, switch는 조건식이 아닌 변수값으로 조건 분기를 해야한다.

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("성별을 입력하세요 : (M/m, F/f)");
            char ch = sc.next().charAt(0);

            switch (ch) {
            case 'M':
            case 'm':
                System.out.println("남성입니다.");
                break; // 괄호를 벗어나는 것, 반복문과 switch문에서 동작
                //return; 입력받은 쪽으로 돌아감 main에서 실행함으로 main을 끝냄
            case 'F':
            case 'f':
                System.out.println("여성입니다.");
                break;
                //return;
            default:
                System.out.println("성별을 잘 못 입력 했습니다. 다시 입력 하세요");
                continue; //조건문으로 돌아가는 것
            }
            break;
        }
    }
}
