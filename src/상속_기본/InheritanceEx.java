package 상속_기본;

//상속이란? 자식클래스가 부모클래스의 기능을 물려받는 것(필드,메소드)
//자식클래스는 부모클래스 + a
//상속을 받아서 그대로 사용하면 상속, 기능을 개선하거나 새롭게 만들면 다형성(오버라이딩)

public class InheritanceEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        HouseDog houseDog = new HouseDog();
        dog.setName("불독");
        houseDog.setName("치와와");
        dog.sleep();
        houseDog.sleep();
        houseDog.sleep(2);
    }
}

//class 는 Object 가 최상위, 모든 기본클래스는 Object에서 상속받음
class Animal {
    String name;
    void setName(String name){
        this.name = name;

    }
}

//Animal을 상속받아 Dog 만들기
class Dog extends Animal{
    void sleep(){
        System.out.println(name + " Zzz");
    }
}

class HouseDog extends Dog{
    @Override //재정의 했다는것을 확인, anotation
    void sleep(){ //재정의, 재정의가 우선
        System.out.println(name + " Zzz in House");
    }
    void sleep(int hour){
        System.out.println(name + " Zzz in for " + hour +" hour"); // 오버로딩
    }
}
