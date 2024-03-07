package 접근제한자2;

public class RestrictEx2 {
        String name;
        // protected : 같은 패키지와 상속 관계에서 접근 가능
        String money;
        String addr;

    public RestrictEx2() {
            name = "Parent Name";
            money = "20억";
            addr = "서울시 강남구 역삼동";
        }
    }

