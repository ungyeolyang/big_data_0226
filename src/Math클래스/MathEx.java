package Math클래스;
// Math 클래스의 모든 메소드는 클래스 메소드 임으로 객체를 생성하지 않음
// java.lang 기본 패키지에 포함되어 있어 별도의 import가 필요없음

import java.util.Random;
public class MathEx {
    public static void main(String[] args) {
        System.out.println("=".repeat(5)+ " random() " + "=".repeat(5));
        //random() : 0.0이상 1.0 미만의 임의의 double 형을 생성해서 반환
        System.out.println((int)(Math.random() * 6));        // 0 ~ 5
        System.out.println((int)(Math.random() * 6) + 1);        // 1 ~ 6
        System.out.println((int)(Math.random() * 6) + 3);        // 3 ~ 8

        Random ran = new Random(); // java.util의 random함수, 객체생성해서 써야한다. 굳이 Math가 있는데..
        System.out.println(ran.nextInt(6));           // 0 ~ 5

        System.out.println("=".repeat(5)+ " abs() " + "=".repeat(5));
        //abs() 절댓값 반환
        System.out.println(Math.abs(10));    // 10
        System.out.println(Math.abs(-10));   // 10
        System.out.println(Math.abs(-3.14)); // 3.14

        System.out.println("=".repeat(5)+ " ceil() " + "=".repeat(5));
        // ceil() : 올림
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.00000001));

        System.out.println("=".repeat(5)+ " floor() " + "=".repeat(5));
        // floor() : 내림
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.00000001));

        System.out.println("=".repeat(5)+ " round() " + "=".repeat(5));
        // round() : 반올림
        System.out.println(Math.round(10.0));
        System.out.println(Math.round(10.4999));
        System.out.println(Math.round(10.5));

        System.out.println("=".repeat(5)+ " max, min() " + "=".repeat(5));
        System.out.println(Math.max(3.14, 3.14159)); // 3.14159
        System.out.println(Math.min(3.14, 3.14159)); // 3.14
    }
}
