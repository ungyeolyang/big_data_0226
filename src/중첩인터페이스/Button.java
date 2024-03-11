package 중첩인터페이스;

public class Button { // 안드로이드 문법
    OnClickListener listener; // 인터페이스에 대한 참조 변수
    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick(); // 구현 객체의 onclick 메소드를 호출
    }

    interface OnClickListener{
        void onClick(); // 추상메소드
    }
}
