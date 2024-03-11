package 자동차만들기;

import java.util.Scanner;

public class CarEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = null; // 밑에 코드가 default인경우에는 값이 안들어 가기 때문에 초기화를 시켜줘야한다.
        //final int[] dist = {0, 400, 200, 150, 300} // switch문 안쓰기위해 거리를 배열로 생성
        int length = 0; // 목적지까지 거리
        int human; // 탑승인원

        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                length = 400;
                break;
            case 2:
                length = 200;
                break;
            case 3:
                length = 150;
                break;
            case 4:
                length = 300;
                break;
        }
        System.out.print("이동할 승객 수 입력 : ");
        human = sc.nextInt();

        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int num1 = sc.nextInt();
        switch (num1) {
            case 1:
                car = new SportsCar("Ferrari");
                break;
            case 2:
                car = new SyCar("GV80");
                break;
            case 3:
                car = new Bus("관광버스");
                break;
        }
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int num2 = sc.nextInt();
        if (num2 == 1) car.bonus();

        int number; // 편도 횟수, 이부분은 모든 클래스가 사용하는 부분임으로 부모에서 생성해 상속해주는 것이 좋다.
        if (human < car.getSeat()) {  //나머지가 생기면 굳이 없어도 되는 부분
            number = 1;
        } else if (human % car.getSeat() == 0) {
            number = human / car.getSeat();
        } else number = (human / car.getSeat()) + 1;

        int oilnum; // 주유횟수
        if ((number * length / car.getOil()) < car.getSize()) {
            oilnum = 1;
        } else if ((number * length / car.getOil()) % car.getSize() == 0)
            oilnum = number * length / car.getOil() / car.getSize();
        else oilnum = (number * length / car.getOil() / car.getSize()) + 1;

        int price = number * length * 2000 / car.getOil();
        float time = (number * length) / (car.getSpeed() / 60); //분속으로 나눠서 걸린시간을 분으로 계산

        System.out.println("=".repeat(5) + car.getName() + "=".repeat(5));
        System.out.println("총 비용 : " + price);
        System.out.println("총 주유 횟수 : " + oilnum);
        System.out.println("총 이동 시간 : " + (int) (time / 60) + "시간" + (int) (time % 60) + "분");
    }
}
