package 오브젝트클래스;
//모든클래스의 조상
public class ObjectClass {
    public static void main(String[] args) {
        Student student = new Student();
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car1.equals(car2));
        car1 = car2; // car1과 car2의 주소가 같아짐, 얕은복사
        System.out.println(car1.equals(car2));

    }
}

class Car{

}

class Student{
    int id;
    String name;
}
