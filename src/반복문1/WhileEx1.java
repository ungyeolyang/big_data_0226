package 반복문1;

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력 : ");
        int num = sc.nextInt();
        int sum = 0; // 지역변수는 초기화가 필요하다.

        while(num > 0) {
            sum += num;
            num--;
        }
//        int i = 1;  for문을 빼내서 사용가능
//        for( ; ; ){
//            sum += i;
//            if(i == num)break;
//            i++;
//        }

        for(int i = 0; i < 4; i++){
            sum += i;
        }
        System.out.println("정수의 합 : " + sum);
    }
}
