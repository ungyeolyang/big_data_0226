package 생성자_Tv만들기;

public class Tv {
    private boolean isOn;
    private int channel;
    private  int volume;

    //기본생성자, 매개변수가 없음
    //생성자를 제품으로 보면 공장초기화 값으로 생각, 다양한 지역별로 다른 생성자 만들고 초기화 시켜줄수 있음
    Tv(){
        isOn = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isOn +", 채널 : " + channel + ", 볼륨 " + volume);
    }

    //오버로딩된 생성자
    Tv(boolean isOn, int channel, int volume){
        this.isOn = isOn;
        this.channel = channel;
        this.volume = volume;
    }

    public void setOn(boolean onOff){
        isOn = onOff;
        String onOffStr = (isOn) ? "On" : "Off"; // bool로 받은 값을 문자열로 변환
        System.out.println("Tv 전원 : " + onOffStr);
    }

    public void setChannel(int cnl){
        if(cnl >= 1 && cnl <=999)//인스턴스 값을 쓰기 전에 유효한 값인지 확인
        {
            channel = cnl;
            System.out.println(("채널을 " + channel + "변경 하였습니다."));
        } else {
            System.out.println("유효하지 않은 채널 입니다.");
        }
    }

    public  void setVolume(int vol) {
        if (vol >= 1 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "변경 하였습니다.");
        } else {
            System.out.println("유효하지 않은 볼륨값 입니다.");
        }
    }

    public void printTvInfo(){
        String onOffStr = (isOn) ? "ON" : "OFF";
        System.out.println("====== TV State ======");
        System.out.printf("전원 : %s\n", onOffStr);
        System.out.printf("볼륨 : %d\n", volume);
        System.out.printf("채널 : %d\n", channel);

    }
}
