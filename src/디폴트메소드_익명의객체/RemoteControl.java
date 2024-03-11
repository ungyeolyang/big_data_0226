package 디폴트메소드_익명의객체;

public interface RemoteControl {
    int MAX_VOLUME = 100; // final static이 자동추가, 상속을 막기위해
    int MIN_VOLUME = 0;
    void turnOn(); // public abstract가 자동추가
    void turnOff();
    void setVolume(int volume);

    //default 메소드 ,JDK 8 이후 추가
    default void setMute(boolean mute){
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음을 해제 합니다.");
    }

    static void changeBattery(){
        System.out.println("건전지를 교환 합니다.");
    }
 }
