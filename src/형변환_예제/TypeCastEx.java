package 형변환_예제;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class TypeCastEx {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double rst1 = num1/num2; // 묵시적형변환
        double rst2 = (double)num1/num2; // 묵시적형변환 + 명시적형변환
        System.out.println(rst1);
        System.out.println(rst2);

        int value1 = parseInt("123"); // 문자열을 정수로 바꿔주는 매소드
        double value2 = parseDouble("123.555");
        double value3 = parseDouble("123.555dd");// dd는 double 아니므로 출력할때 오류발생
        System.out.println(value1);
        System.out.println(value2);
    }
}
