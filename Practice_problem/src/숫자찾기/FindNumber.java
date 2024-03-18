package 숫자찾기;
//배열 갯수를 입력 받아 배열의 길이 만큼 랜덤수를 생성해서 배열에 추가
//배열의 길이가 100, 랜덤수는 1~100
//임의의 수를 입력받아 해당 값이 존재하는지 확인

import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 : ");
        int n = sc.nextInt();

        Integer[] num = new Integer[n];
        for(int i = 0; i<num.length; i++){
            num[i] = (int)((Math.random()*n)+1);
        }
        Arrays.sort(num);
        System.out.print("찾을 숫자 : ");
        int x = sc.nextInt();
        System.out.println(Arrays.toString(num));
        char check = Arrays.binarySearch(num,x) > 0 ? 'O' : 'X';
        System.out.print(check);
    }
}
