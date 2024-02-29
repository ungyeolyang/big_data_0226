package 시스템_입출력;

//        - 서식지정자 : %d, %ld, %u, %f, %.2f, %2d, %s, %c , %%(%출력)
//        - 이스케이프시퀀스 : \n, \r, \t, \b, \\
//        - %6d : 6자의 정수 공간을 확보하고 오른쪽 정렬
//        - %-10.2f : 10자리 공간을 확보하고 왼쪽 정렬
//        - %6s : 문자열공간을 6자리 확보하고 오른쪽 정렬

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "서울시 강남구 역삼동";
        char gender = 'M'; //char은 ''로 감싸야함
        int kor = 99;
        int eng = 87;
        int mat = 40;

        double aver = 0.0; //평균을 구하기 위한 변수

        System.out.println("=".repeat(5) + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("총점 : " + kor + eng + mat); // 맨 앞이 문자열이면 문자열 연산으로 간주
        System.out.println(kor + eng + mat + " : 총점" );
        System.out.println("총점 : " + (kor + eng + mat));
        System.out.println(kor + eng + mat);
        System.out.println("평균 : " + (kor + eng + mat) / 3);
        System.out.println("평균 : " + (double)(kor + eng + mat) / 3);
        System.out.printf("평균 : %.2f\n",(double)(kor + eng + mat) / 3);
        System.out.printf("습도 : %d%%\n",65);


    }
}
