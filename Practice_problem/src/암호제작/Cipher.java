package 암호제작;

import java.math.BigInteger;
import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        int y = sc.nextInt();
        boolean isGood = true;
        for(int i = 2; i < y; i++){
            if(x.compareTo(BigInteger.valueOf(i)) == 0){ break; }
            if(x.mod(new BigInteger(String.valueOf(i))).compareTo(BigInteger.ZERO)==0){
                System.out.println("BAD "+ i);
                isGood = false;
                break;
            }
        }
        if(isGood){System.out.println("GOOD");}
    }
}
