package 접근제한자;

public class Restrictor {
    public void seoul(){
        System.out.println("서울 메소드는 Public");
    }

    void busan(){
        System.out.println("부산 메소드는 Default");
    }

    protected void inchun(){
        System.out.println("인천 메소드는 Protected");
    }

    private  void degu(){
        System.out.println("대구 메소드는 Private");
    }
}
