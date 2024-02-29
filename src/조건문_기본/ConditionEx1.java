package 조건문_기본;

import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요");
        int num = sc.nextInt();
        if(num > 100){
            System.out.print(num + "은 100보다 커요");
        } else if(num == 100){
            System.out.print(num + "은 100과 같아요");
        } else {
            System.out.println(num + "은 100보다 작아요");
        }
    }
}
