package 추상클래스;
// 객체로 생성 불가
public abstract class Phone {
    public String name;
    public boolean isPower;

    public Phone(String name) {
        this.name = name;
    }

    public void setPower(boolean power) {
        isPower = power;
        if(isPower) {
            System.out.println(name + " Phone Power ON");
        }
        else {
            System.out.println(name + " Phone Power Off");
        }
    }

    abstract void call(); // 구현부없이 이름과 매개변수만 선언, 반드시 재정의
    void call1(){} // 상속, 재정의 해도 되고 안해도 됨
}
