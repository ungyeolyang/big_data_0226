package X보다작은수;
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 크기
        int x = sc.nextInt(); // 비교할 수

        int[] num = new int[n];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            if(num[i] < x) System.out.print(num[i] + " ");
        }
    }
}
