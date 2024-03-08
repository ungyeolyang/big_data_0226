package 추상클래스;

public class SmartPhone extends Phone{
    public SmartPhone(String name) { // 부모의 생성자가 따로 있었으므로 부모를 불러줘야함
        super(name);
    }

    @Override
    public void call() { // abstract를 구체화
        System.out.println("부모의 요청으로 통화기능을 완성 하겠습니다.");
    }

    public void internet(){ // 새로운 기능을 추가
        System.out.println("인터넷을 검색 합니다.");
    }
}
