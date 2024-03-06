package 상속_Tv만들기;

public class PrototypeTv {
    boolean isPower;  // 전원에 대한 설정값 저장
    int channel;      // 채널에 대한 설정값을 저장하는 인스턴스 필드
    int volume;       // 볼륨에 대한 설정값을 저장하는 인스턴스 필드
    // 생성자가 하는 일은 객체가 생성될 때 필드에 초기값을 할당한 역할이다.
    public PrototypeTv() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }
    // 생성자 오버로딩 : 생성자를 매개변수의 갯수나 타입에 따라 다양하게 호출 하도록 함
    public PrototypeTv(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 1000) {
            channel = cnl;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
