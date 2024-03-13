package 제네릭;

public class GenericEx {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("가을");
        Person<Integer> p2 = new Person<>(1000);
        System.out.println(p1.info);
        System.out.println(p2.info);
    }
}

class Person <T> {
    public T info;
    Person(T info){
        this.info = info;
    }

}
