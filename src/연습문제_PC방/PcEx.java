package 연습문제_PC방;

import java.util.Scanner;

public class PcEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입장인원을 입력하세요
        int input = sc.nextInt();
        //좌석 예약
        int[] pc = new int[100]; // heep영역에 공간이 확보되고 0으로 자동 초기화
        int count = 0;

//        int seatNum;
//        for(int i = 0; i < input; i++) {
//            seatNum = sc.nextInt();
//            if (pc[seatNum - 1] == 1) count++;
//            else pc[seatNum - 1] = 1;
//        }
//        System.out.print(count);

        for(int i = 0; i < input; i++){
            pc[i] = sc.nextInt();
        }

        for(int i = 0; i < input-1; i++){
            for(int j = i+1; j < input; j++ ) {
                if (pc[i] == pc[j]) {
                    pc[j] = 0;
                }
            }
            if(pc[i] != 0 ) count++;
        }

        System.out.print(input-count);
    }
}
