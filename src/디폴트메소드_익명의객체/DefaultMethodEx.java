package 디폴트메소드_익명의객체;

import java.util.Scanner;

// 인터페이스에 있는 구현 메소드
// 메소드 앞에 default를 붙혀줌
// { } 구현부가 존재
public class DefaultMethodEx {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        Scanner sc = new Scanner(System.in);
        System.out.println("제품 선택 [1]Tv [2]Audio : ");
        int sel = sc.nextInt();
        if(sel == 1) {
            remoteControl = new Tv();
            remoteControl.turnOn();
            remoteControl.setVolume(20);
            remoteControl.setMute(true);
            RemoteControl.changeBattery(); // static임으로 class명으로 접근
        }
        else {
            remoteControl = new Audio();
            remoteControl.turnOn();
            remoteControl.setVolume(40);
            remoteControl.setMute(true);
            RemoteControl.changeBattery();
        }
        RemoteControl rc = new RemoteControl() { // 인터페이스에 바로 생성:익명의 객체
            int volume;
            @Override
            public void turnOn() {
                System.out.println("플레이 스테이션5 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("플레이 스테이션5 끕니다.");
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
                System.out.println("현재 오디오 볼륨 : " + this.volume);
            }
        }; // 끝에 닫아줘야한다.

        rc.turnOn();
        rc.setVolume(100);
        rc.turnOff();
    }
}
