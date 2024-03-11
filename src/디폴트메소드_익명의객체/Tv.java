package 디폴트메소드_익명의객체;

public class Tv implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
            else if(volume < RemoteControl.MIN_VOLUME){
                this.volume = RemoteControl.MIN_VOLUME;
            }
            else {
                this.volume = volume;
            }
            System.out.println("현재 Tv 볼륨 : " + this.volume);
        }

//    @Override
//    public void setMute(boolean mute) {
//        RemoteControl.super.setMute(mute); // 그대로 사용할 때는 굳이 선언안해줘도 사용가능
//    }
}
