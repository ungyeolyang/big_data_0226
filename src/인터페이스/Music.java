package 인터페이스;

public class Music implements Playable{
    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }
}

class Video implements Playable{
    @Override
    public void play() {
        System.out.println("비디오를 재생합니다.");
    }
}
