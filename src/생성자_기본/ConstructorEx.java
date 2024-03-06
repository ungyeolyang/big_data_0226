package 생성자_기본;

//클래스가 객체로 만들어 질 때 호출 되는 매서드 (무조건 호출 됨)
//인스턴스 필드 초기화 목적으로 사용
//생성자는 클래스 이름과 동일
//생성자는 반환 타입이 없지만 void를 사용하지 않음
//하나의 클래스는 여러개의 생성자를 가질수 있음 (생성자 오버로딩)
public class ConstructorEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.company = "현대";
        car1.model = "싼타페";
        car1.color ="검정";

        Car car2 = new Car("현대");
        car2.model = "싼타페";
        car2.color ="검정";

        Car car3 = new Car("현대","싼타페");
        car3.color ="검정";

        Car car4 = new Car("현대","싼타페","검정");

        car1.carInfo();
        car2.carInfo();
        car3.carInfo();
        car4.carInfo();
    }
}

class Car{
    String company;
    String model;
    String color;
    int speed;
    int horsePower;
    //생성자는 리턴타입이없음
    Car(){} // default 생성자는 선언안해도 자동 생성, 다른 생성자를 만들면 따로 만들어 줘야 한다.
    Car(String company){ // 생성자 오버로딩, 동일한 이름의 메소드를 매개변수의 개수나 타입으로 구분
        this.company = company;
    }
    Car(String  company, String model){
        this.company = company;
        this.model = model;
    }
    Car(String  company, String model, String color){
        this.company = company;
        this.model = model;
        this.color = color;
    }

    public void carInfo(){
        System.out.println("제조사 : " + company);
        System.out.println("모델 : " + model);
        System.out.println("색상 : " + color);
        System.out.println();
    }
}
