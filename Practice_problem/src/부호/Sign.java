package 부호;

import java.math.BigInteger;
import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sign = new String[3];
        for (int i = 0; i < 3; i++) {
            int input = sc.nextInt();
            BigInteger sum = new BigInteger("0");
            for (int j = 0; j < input; j++) {
                sum = sum.add(sc.nextBigInteger());
            }
            if (sum.compareTo(new BigInteger("0")) > 0) {
                sign[i] = "+";
            } else if (sum.compareTo(new BigInteger("0")) == 0) {
                sign[i] = "0";
            } else {
                sign[i] = "-";
            }
        }
        for (String result : sign) {
            System.out.println(result);
        }
    }
}