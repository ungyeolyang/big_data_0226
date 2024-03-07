package 슈퍼변수와메소드;

//super : 자식클래스가 부모 클래스로 부터 상속받은 맴버를 참조할때 사용
// super() : 자식클래스에서 부모클래스의 생성자를 호출하는 메소드
public class SuperEx {
    public static void main(String[] args) {
        Child child = new Child(20);
        child.childMethod();

    }
}

class Parent{
    static int x = 10;
    Parent(int x){
        this.x = x;
    }
}

class Child extends Parent{
    int x;
    Child(int a) { // 부모의 생성자를 만들어 줘야한다.
        super(10);
        x = a;
    }

    void childMethod(){
        System.out.println("super.x  : " + super.x);
        System.out.println("Parent.x (x가 static 이어야함)  : " + Parent.x);
        System.out.println("this.x  : " + this.x);
        System.out.println("x  : " + x);
    }
}
