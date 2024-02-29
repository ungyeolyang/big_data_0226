package 반복문2;

import java.util.Scanner;

//while문은 반복 횟수가 정해지지 않은 경우에 주로 사용
//for문은 반복 횟수가 정해져 있는 경우에 주로 사용
public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("나이를 입력 하세요 : ");

        while(true){
            age = sc.nextInt();
            if(age >= 0 && age < 200) break;
            System.out.println("잘못 입력하셨습니다."); // 굳이 else 안해도 참이면 break
        }

//        boolean isRe = false;
//        do{
//            System.out.println("나이를 입력 하세요 : ");
//            age = sc.nextInt();
//            if(!isRe)  System.out.println("잘못 입력하셨습니다.");
//                else isRe = true;
//        }while(age < 0 && age >= 200);

        System.out.println("당신의 나이는 " + age + "입니다. ");
    }
}
