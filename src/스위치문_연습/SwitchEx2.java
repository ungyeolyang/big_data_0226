package 스위치문_연습;

// 스위치 문에서 조건을 비교하는 변수로 사용 될 수 있는 것은 정수, 문자, 문자열 가능(실수는 불가)

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        int x, y;
        char op;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("계산식 입력 : ");
            x = sc.nextInt();
            op = sc.next().charAt(0);
            y = sc.nextInt();
        switch (op) {
            case '+':
                System.out.println("덧셈 결과 : " + (x + y));
                break;
            case '-':
                System.out.println("뺄셈 결과 : " + (x - y));
                break;
            case '*':
                System.out.println("곱셈 결과 : " + (x * y));
                break;
            case '/':
                System.out.println("나눗셈 결과 : " + ((double) x / y));
                break;
            default:
                System.out.println("계산식을 잘 못 입력했습니다.");
                continue;
        }
        break;
        }
    }
}
