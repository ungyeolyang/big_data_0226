package 제네릭_프린터;

public class Plastic {
    public void doPrinting(){
        System.out.println("플라스틱 재료로 출력합니다.");
    }

    @Override
    public String toString(){
        return "재료는 플라스틱 입니다.";
    }
}
