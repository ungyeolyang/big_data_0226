package 상속_객체타입확인;

// 객체 타입을 확인하는 instanceof
public class ObjectType {
    public static void main(String[] args) {
        Parent parent = new Parent("부모 클래스");
        Child child = new Child("자식 클래스");

        System.out.println(parent.name);
        System.out.println(child.name);

        System.out.println(parent instanceof Parent);
        System.out.println(child instanceof Parent);
        System.out.println(parent instanceof Child);
        System.out.println(child instanceof Child);

        Parent parent1 = new Child("자식");// 부모속성으로 자식을 생성할수 있다.
    }
}

class Parent{
    String name;
    Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent{
    Child(String name) {
        super("부모");
        // 부모생성자 호출, 부모가 기본생성자이면 생략가능, 자식을 만들기전 부모를 만들어준다음 상속
        this.name = name;
    }
}
