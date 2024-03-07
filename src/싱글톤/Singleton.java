package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static final Singleton singleton = new Singleton();
    // 한번은 객체로 만들어지도록 static
    // static으로 선언 안하면
    // stack영역에서 생성되는데 종료되면 gc가 삭제함으로
    // 프로그램 종료할 때까지 살아 있도록 static으로 선언
    private Singleton(){ // 생성자를 외부에서 부르는데 제한하기 위해
        name = "test";
        id = 100;
    }

    static Singleton getSingleton(){
        return singleton;
    }
}
