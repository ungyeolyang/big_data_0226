package 연습문제_손익분기점;

import java.util.Scanner;

// a 고정비용
// b 가변비용
// c 제품가격
public class BreakEventPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];

        for(int i = 0; i< 3; i++) {
            a[i] = sc.nextInt();
        }
        if(a[1] >= a[2]) {
            System.out.println("-1");
            return;
        }
//        for(int i = 0;;i++){ //수가 너무 커짐 fail
//            if((a[0]+(a[1] * i)) < a[2] * i) {
//                System.out.println(i);
//                break;
//            }
//        }
        System.out.println((a[0]/a[2]-a[1])+1); // 손익분기점 식
    }
}
