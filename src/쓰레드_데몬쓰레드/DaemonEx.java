package 쓰레드_데몬쓰레드;

import java.util.ArrayList;

//쓰레드를 보조하는 쓰레드
//다른 쓰레드들이 종료하면 데몬쓰레드는 강제 종료
public class DaemonEx {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveTread autoSaveTread = new AutoSaveTread();
        autoSaveTread.setDaemon(true); // 데몬 쓰레드로 설정
        autoSaveTread.start();
        Thread.sleep(30000); // 메인이 죽으면 데몬이 죽으니까 메인을 30초 살려두기 위해
    }
}

class AutoSaveTread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장합니다.");
    }

    @Override
    public void run(){ // 1초마다 save
        while (true){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break; // interupt가 없으면 save 작동안함
            }
            save();
        }
    }
}
