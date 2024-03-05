package 연습문제_영화표예매하기;
//예매하기와 종료하기 메뉴 작성
//극장의 좌석은 10개
//좌석당 판매금액은 생성자를 통해서 정의
public class MovieMain {
    public static void main(String[] args) {
    MovieTicket ticket = new MovieTicket(12000);
    ticket.manu();
    }

}
