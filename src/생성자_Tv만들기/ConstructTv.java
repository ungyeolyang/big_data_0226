package 생성자_Tv만들기;

public class ConstructTv {
    public static void main(String[] args) {
        Tv lgTv = new Tv();
        lgTv.setOn(true);
        lgTv.setVolume(105);
        lgTv.setChannel(458);
        lgTv.printTvInfo();

        Tv samsumgTv = new Tv(true,250,80);
        samsumgTv.printTvInfo();
    }
}
