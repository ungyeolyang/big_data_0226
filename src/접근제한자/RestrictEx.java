package 접근제한자;
//public 모든 곳에서
//protected 상속받은 모든곳에서, 일반적으로는 default와 동일
//default 동일 패키지 내에서만 (자바에만 있음)
//private 동일 클래스 내부에서만
public class RestrictEx {
    public static void main(String[] args) {
        Restrictor retrictor = new Restrictor();
        retrictor.seoul();
        retrictor.inchun();
        retrictor.busan(); // 대구는 private라서 다른 클래스에서 호출이 불가능

    }
}

