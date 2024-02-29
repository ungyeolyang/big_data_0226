package 연습문제_소수찾기;

import java.util.Scanner;

//1은 소수가 아니다
public class Deciamal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i =2;  i<=num; i++) sum += primeFunc(i);
        System.out.println(sum);
    }

        static int primeFunc (int n) {

            int sum = 0;
            for (int i = 2; i <= n; i++) {
                if (!(n % i == 0)) ;
                else sum += i;
            }
            if (sum == n) return n;
            else return 0;
        }
        //count로 나뉘어진 개수로 해서 1번으로해도 됨
    }

