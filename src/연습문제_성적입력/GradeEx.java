package 연습문제_성적입력;

import java.util.Scanner;

public class GradeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0; //while 안에서 계속 생성하는 것보다 밖에서 생성해서 내부에서 재사용
        while (true){
            System.out.println("시험 성적을 입력하세요 : ");
            num = sc.nextInt();
            if(num > 100 || num < 0){
                System.out.println("잘못 입력 했습니다. 다시입력하세요.");
                continue;
            }
            if(num<=100 && num>=90){
                System.out.println('A');
            } else if (num<=80 && num>=89) {
                System.out.println('B');
            } else if (num<=79 && num>=70) {
                System.out.println('C');
            } else if (num<=69 && num>=60) {
                System.out.println('D');
            } else
                System.out.println('F');
                break;

        }
    }
}
