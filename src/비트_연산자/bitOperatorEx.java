package 비트_연산자;

public class bitOperatorEx {
    public static void main(String[] args) {

        int num1 = 10; // 1010
        int num2 = 12; // 1100
        System.out.println(num1 & num2); //1000
        System.out.println(num1 | num2); //1110
        System.out.println(num1 ^ num2); //0110
        System.out.println(~num1); // 1이 모자란 보수
        System.out.println(num1 << 1); //0001 0100
        System.out.println(num1 >> 1); //0101
    }
}
