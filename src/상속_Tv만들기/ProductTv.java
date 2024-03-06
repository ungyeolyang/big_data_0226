package 상속_Tv만들기;

public class ProductTv extends PrototypeTv{
    String name;
    boolean isInternet;
    ProductTv() { // 자식 클래스의 생성자
        // 매개변수가 있는 부모의 생성자가 호출 되었음
        super(true, 30, 30);
        name = "LG TV";
    }
    ProductTv(String name) {
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }
    void setPower(boolean isPower) {
        this.isPower = isPower;
    }
    void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            this.volume = vol;
        } else {
            System.out.println("볼륨 설정 범위를 벗어 났습니다.");
        }
    }

    // 오버 라이딩 : 부모에게서 물려 받은 것을 재정의 해서 사용 함
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 2000) {
            channel = cnl;
            System.out.println("채널을 " + channel + "변경 했습니다.");
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
    // 메소드 오버로딩 : 동일 이름의 메소드를 매개변수의 갯수나 타입으로 구분하는 것
    public void setChannel(int cnl, boolean isInternet) {
        if(isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if(cnl > 1 && cnl < 2000) {
                channel = cnl;
                System.out.println("채널을 " + channel + "변경 했습니다.");
            } else System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }

}

