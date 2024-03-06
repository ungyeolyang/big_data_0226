package 상속_응용1;
// 상속에서 final 사용
// final : 수정불가 상태로 만드는 키워드(c는 선언과 동시에 초기화, 자바는 한번은 대입가능)
public class InheritanceEx2 {
    public static void main(String[] args) {

    }
}

class Car{
    int speed;
    String color;
    String name;

    final void accelerator(){ // 상속 가능
        System.out.println("차의 속도를 증가 시킵니다.");
    }

    final void breakPanel(){
        System.out.println("차 속도를 감소 시킵니다.");
    }
}

class SportsCar extends Car{
    boolean isTurbo;
    SportsCar(String name){
        isTurbo = false;
        speed = 280;
        this.name = name;
        color = "Red";
    }
    int getSpeed(){
        if(isTurbo) return speed *= 1.2;
        return speed;
    }

    //void accelerator(){} fianal은 변경불가

    boolean isTurbo(){
        return isTurbo;
    }

    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
    }
}
