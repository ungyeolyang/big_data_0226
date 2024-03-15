package 함수형인터페이스;
// 자바는 함수가 독립적으로 만들어질수 없음으로 사용하는 문법
@FunctionalInterface
interface Calculator{ // 람다식 구현하기위해 만들어줌
 int sum(int a, int b);
}
//class MyCalculator implements Calculator{ // 일반적인 상속으로 구현
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}
public class FunctionalEx {
    public static void main(String[] args) {
        Calculator mc = (a,b) -> a + b; // 람다식 구현
        int result = mc.sum(100, 200);
        System.out.println(result);
    }
}

