package 상속_Tv만들기;
//시제품 Tv 만들고, 상속 받아서 기능이 개선된 양산용 Tv 만들기

public class InheritanceTv {
    public static void main(String[] args) {
    ProductTv lgTv = new ProductTv("My Home True");
    lgTv.setPower(true);
    lgTv.setVolume(90);
    lgTv.setChannel(1500,true);
    lgTv.viewTV();
    }
}
