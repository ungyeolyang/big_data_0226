package 연습문제_집주소;

import java.util.Scanner;

//양 끝에는 1cm의 여백
//각 숫자 사이에는 1cm의 여백이 들어가야한다
//1은 2cm 0은 4cm 나머지는 3cm의 너비를 차지한다
//호수판에 들어갈 숫자 N의 범위는 1 ≤ N ≤ 9999 이다.
//입력은 마지막에 0이 들어오기 전까지 계속해서 줄 단위로 주어진다.
//또한, 마지막의 0은 처리하지 않는다.
public class Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] numSize ={4,2,3,3,3,3,3,3,3,3}; // 각 번호가 차지하는 자리수 배열 만들기
        //List<Integer> rst = new ArrayList<>();
        //int sum = 0;
        //while(true) {
        // String num = sc.nextInt();
        // if(num.equals("0")) break;
        // for(int i = 0; i < num; i++){
        // sum += numSize[num.charAt(i) - '0'] +1 //char - '0' -> 1을 빼준거
        // }
        // rst.add(sum + 1);
        // sum = 0;
        // }
        //for(int e : rst) System.out.printLn(e)// Integer 지만 int 써도됨

        String input;
        String[] num = new String[10];
        for (int i = 0;;i++) {
            input = sc.next();
            if(input.equals("0")) break;
            num[i] = input;
        }

        for(int i = 0; i < num.length; i++){
            if (num[i] == null) continue;
            int sum = 0;
            for(int j = 0; j < num[i].length();j++) {
                    switch (num[i].charAt(j)) {
                        case '1': sum += 2; break;
                        case '0': sum += 4; break;
                        default:  sum += 3; break;
                }
            }

            System.out.println(2+sum+(num[i].length()-1));
        }
    }
}
