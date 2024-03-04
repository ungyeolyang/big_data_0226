package 메소드_연습_영화표예매;

import java.util.Scanner;

public class Ticket {

    Scanner sc = new Scanner(System.in);
    private int[] seat = new int[10];
    private int[] seatNum = new int[10];
    int count;
    int input;
    int price = 12000;
    public void manu(){
        System.out.print("1.예약하기, 2,종료하기");
        input = sc.nextInt();
    }
    public void getSeat() {
        System.out.print("현재 남은 좌석 : ");
        for (int i = 0; i < seat.length; i++) {
            if (seat[i]!= 1) System.out.print(i+1 + " ");
        }
        System.out.println();
    }

    public void setSeat() {
        System.out.print("좌석을 선택하세요 : ");
        for (int i = 0; i < seat.length; i++) {
                seatNum[i] = sc.nextInt();
                count++;
                if (seat[seatNum[i]-1] == 1 || (seatNum[i]>10 || seatNum[i] < 0)){
                        System.out.print("잘못된 입력입니다. 다시 입력하세요");}
                else {
                    seat[seatNum[i]-1] = 1;
                    break;

            }
        }

    }
    public void book(){
        System.out.print("결제할 금액은 " + (count * price) + "원 입니다.");
    }
}