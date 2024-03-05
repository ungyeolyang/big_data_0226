package 재귀호출;

import java.util.Scanner;

//메소드 내부에서 해당 메소드를 또 다시 호출
//길찾기 또는 퀵정렬 등
public class RecursiveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        System.out.println("while : " + funcSumWhile(num));
        System.out.println("recursive : " + funcSumRecursive(num));
    }

    //while 메소드
    static int funcSumWhile(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            if (n == 1) break;
            n--;
        }
        return sum;
    }

    //recursive 메소드

    static int funcSumRecursive(int n){
        if(n == 1) return 1;
        // 나가는 곳을 만들어 줘야함, 끝을 만날때까지 동작안하다가 마지막에 되돌아가면서 값을 리턴
        return n + funcSumRecursive(n-1);
    }
}
