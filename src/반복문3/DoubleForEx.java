package 반복문3;

public class DoubleForEx {
    public static void main(String[] args) {
        System.out.println("구구단 찍기");
        for(int i = 2; i < 10; i++){
            System.out.println(i + "단");
            for(int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
//              System.out.printf("%d X %d = %d\n", i, j,(i*j));
            }
            System.out.println();
        }
    }
}
