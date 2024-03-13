package 제네릭_프린터;

//프린터에 사용할 재료
public class Powder {
    public void doPrinting(){
        System.out.println("파우더 재료로 출력합니다.");
    }
    @Override
    public String toString(){
        return "재료는 파우더 입니다.";
    }
}
