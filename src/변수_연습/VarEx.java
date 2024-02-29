package 변수_연습;

public class VarEx {
    public static void main(String[] args) {
        int age = 100;
        if(age > 10){
            int m = 30;
            m = age - 10;
        }
//        int k = m + age; m은 지역변수이기 때문에 {}를 벗어난 범위에서는 삭제
        double texRate = 1.0;
        String name1 = ""; String name2 = null;

        String addr = "서울시 강남구 역삼동 Kh정보교육원"; // string은 8byte 64bit머신일 경우
        String addr1 = "서울시 강남구 역삼동 Kh정보교육원"; //리터럴 상수로 코딩되어 같은 string을 가지고 있으면 같은 주소
        String addr2 = "서울시 강남구 역삼동 Kh정보교육원.";//.이 다르기때문에 주소가 다름
        //case에는 실수 못씀
        // 근사치 표기법

        float height = 170.55f;
        double pi = 3.145992653589793;

        //상수(constant)
        final double PI = 3.141592;
        final int YEAR = 365;


    }
}
