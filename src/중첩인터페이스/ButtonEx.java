package 중첩인터페이스;
//중첩 인터페이스는 클래스내부에 선언한 인터페이스를 의미
public class ButtonEx {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch();
        button.setOnClickListener(new MessageListener());
        button.touch();
    }
}
