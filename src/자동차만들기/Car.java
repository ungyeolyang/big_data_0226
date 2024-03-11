package 자동차만들기;

public interface Car {
    // 구현부를 상속할수 없어서 게터나 세터를 각각 구현해줘야하는 단점이있다.
    // abstract 클래스로 만들어 생성 못하게 해주는것이 좋음
    float speed = 0; // protected로 구현을 해서 보안성을 높혀주는게 좋음
    int oil = 0;
    int size = 0;
    int seat = 0;

    //생성자를 만들어서 자식이 super로 값을 대입하기만 하면된다.
    //무조건 생성해야하는 메소드는 abstract로 생성해준다.

    String getName();
    int getSeat();
    int getSize();
    void bonus();
    float getSpeed();
    int getOil();
}

class SyCar implements Car{

    String name;

    float speed = 200;
    int oil = 12;
    int size = 45;
    int seat = 4;

    SyCar(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void bonus() {
        seat += 1;
    }
    public float getSpeed() {
        return speed;
    }
    public int getOil() {
        return oil;
    }
    public int getSeat() {
        return seat;
    }
    public int getSize() {
        return size;
    }
}
class SportsCar implements Car{
    String name;
    float speed =250;
    int oil = 8;
    int size = 30;
    int seat = 2;

    SportsCar(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getSeat() {
        return seat;
    }
    public void bonus() {
        speed += 50;
    }
    public int getSize() {
        return size;
    }
    public int getOil() {
        return oil;
    }
    public float getSpeed() {
        return speed;
    }
}

class Bus implements Car{
    public String name;
    float speed = 150;
    int oil = 5;
    int size = 100;
    int seat = 20;

    Bus(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getOil() {
        return oil;
    }
    public void bonus() {
        this.size += 30;
    }
    public int getSeat() {
        return seat;
    }
    public int getSize() {
        return size;
    }
    public float getSpeed() {
        return speed;
    }
}