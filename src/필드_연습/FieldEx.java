package 필드_연습;

//클래스 내부에 선언된 변수
//각각의 인스턴스 마다 별도의 값을 저장
//private, default, protected, public
// static 키워드를 사용하면 클래스 변수, 객체 생성시 생성되지 않고 클래스 생성시 한번만 생성
//필드의 값을 읽고 쓰기 위해서
//게터와 세터를 만들어 주는 것이 일반적(spring boot에서는 롬복 사용으로 대체 가능?)
public class FieldEx {
    public static void main(String[] args) {
        int localVal = 30;
        // 지역변수, stack영역에 생성됨, {}내에서만 생존 함, 할당시 초기화 되지 않음 직접해줘야함
        FieldClass f1 = new FieldClass(); // 인스턴스
        FieldClass f2 = new FieldClass(); // 인스턴스

        //인스턴스 필드에 값 대입, 참조변수로 접근, 객체 생성 개수 마다 생성
        f1.instanceVal = 11;
        f2.instanceVal = 100;
        System.out.println("f1 instanceField : " + f1.instanceVal);
        System.out.println("f2 instanceField : " + f2.instanceVal);

        //클래스 변수는 클래스명으로 접근
        FieldClass.classVal = 1000;
        System.out.println("classField : " +FieldClass.classVal);
    }
}

class  FieldClass{
    int instanceVal = 20; // 인스턴스 변수(필드), 객체 생성시 생성, heap영역에 할당
    static int classVal = 10; // 클래스 변수, 클래스 생성시 생성, static 영역에 할당

}
