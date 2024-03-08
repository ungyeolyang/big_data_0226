package 추상클래스;

// 추상클래스는 객체를 생성할 수 없는 클래스를 의미
// 추상클래스는 추상메소드와 일반 메소드가 혼용 되어 있다.
// 다중 상속을 지원하지 않음
// 추상메소드는 <반드시> 자식 클래스에서 오버라이딩을 해야한다.(상속에서는 해도되고 안해도 된다.)
// 왜냐면 부모가 해당메소드를 구현하지 않았기 때문에

public class AbstractEx {
    public static void main(String[] args) {

//        Phone phone = new Phone() { // 추상화된 클래스는 생성불가, 한번사용할 객체는 익명으로 만들수 있음
//            @Override
//            void call() {
//
//            }
//        }

        Phone smartPhone = new SmartPhone("갤럭시");
        smartPhone.setPower(true);
        smartPhone.call();
//      smartPhone.internet(); Phone 내부의 객체만 가능, 확장성을 위해 부모로 들어가는게 좋다

        SmartPhone smartPhone1 = new SmartPhone("갤럭시 23");
        smartPhone1.setPower(true);
        smartPhone1.call();
        smartPhone1.internet();
    }
}


