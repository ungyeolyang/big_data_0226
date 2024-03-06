package 다형성_매개변수;

import java.util.Scanner;

public class TypecastEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv tv = new Tv();
        Computer computer = new Computer();
        Audio audio = new Audio();
        Scanner sc = new Scanner(System.in);

//        Product product = new Tv();
//        product.name; // 부모는 a에 접근하지 못함
//        Tv tv1 = new Tv();
//        tv1.name;

        while (true) {
            System.out.println("구입할 제품 입력(Tv [1] Computer [2] Audio [3] 종료[4]) :");
            int selNum = sc.nextInt();
            switch (selNum) {
                case 1:
                    System.out.println("Tv를 구입합니다");
                    buyer.buy(tv);
                    break;
                case 2:
                    System.out.println("Computer를 구입합니다");
                    buyer.buy(computer);
                    break;
                case 3:
                    System.out.println("Audio를 구입합니다");
                    buyer.buy(audio);
                    break;
                case 4:
                    buyer.viewInfo();
                    return;
                default:
            }
        }
    }
}

class Product {
    int prise;
    int bonusPoint;
}

class Tv extends Product{
    String name;
    Tv(){
        this.name = "my Tv"; // 부모가 가지고 있지 않은 필드라서 출력못하는 제약이있음
        this.prise = 100;
        this.bonusPoint = 10;
    }
}

class Computer extends Product{
    Computer(){
        this.prise = 200;
        this.bonusPoint = 20;
    }
}

class Audio extends Product{
    Audio(){
        this.prise = 120;
        this.bonusPoint = 12;
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){ // 동적 바인딩, 느슨한 결합관계
        money -= p.prise;
        bonusPoint += p.bonusPoint;
    }

    void viewInfo(){
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}
