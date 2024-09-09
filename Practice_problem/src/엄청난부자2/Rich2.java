package 엄청난부자2;

import java.math.BigInteger;
import java.util.Scanner;

//첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다. (1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수s)
//첫째 줄에 생명체 하나에게 돌아가는 돈의 양을 출력한다. 그리고 두 번째 줄에는 1원씩 분배할 수 없는 남는 돈을 출력한다.
public class Rich2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger[] num = new BigInteger[2];
        for(int i = 0; i < 2 ; i++){
            num[i] = sc.nextBigInteger();
        }
        System.out.println(num[0].divide(num[1]) + "\n" + num[0].mod(num[1]));
        sc.close();
    }
}
