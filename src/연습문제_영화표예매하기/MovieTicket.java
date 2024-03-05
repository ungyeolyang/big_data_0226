package 연습문제_영화표예매하기;

import java.util.Scanner;

// 예매하기 현재 좌석 상태를 보여주고 예약을 받음, 예약을 하게되면 예약을 하게되면 예약된 상태를 보여줌
// 종료하기시 총 판매금액 구하기
public class MovieTicket {
    // 좌석에 배열 만들기
    int[] seat = new int[10]; // 초기화 하지 않아도 전부 0으로 초기화 됨
    int ticketPrice;
    Scanner sc = new Scanner(System.in);

    MovieTicket(int price){ // 객체 생성시 생성자를 통해서 티켓 가격을 정함
        ticketPrice = price;
    }

    void manu(){
        int input;
        System.out.println("[1]예매하기, [2]종료하기");
        input = sc.nextInt();
        switch (input){
            case 1: selectSeat(); break;
            case 2: System.out.println("총 가격은 " + totalAmount() + "입니다."); break;
            default: System.out.println("잘못된 입력 입니다."); manu(); break;
        }
    }
    //남은 좌석 확인
    void printSeat() {
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[v]");
        }
        System.out.println(); // 줄바꿈
    }

    // 좌석 예매하기
    void selectSeat() {
        printSeat();
        while(true) {
            System.out.println("좌석 번호를 입력하세요");
            int seatNum = sc.nextInt();
            if (seat[seatNum - 1] == 0) {
                seat[seatNum - 1] = 1;
                printSeat();
                manu();
                break;
            } else System.out.println("잘못된 입력입니다.");
        }
    }

    //종료시 좌석판매에 대한총 매출액 구하기
    int totalAmount() {
        int cnt = 0;
        for (int e : seat) if(e == 1) cnt++;
        return cnt * ticketPrice;
    }
}
