package 메모리구조;

public class MemoryMap {
    public static void main(String[] args) {
        //기본 타입 변수 성능향상을 위해사용(바로사용가능)
        int age = 25;
        Integer ages = 25; // static 저장

        //참조타입
        String name = "곰돌이사육사"; // static 저장
        String name2 = new String("달빛사냥꾼"); //heap영역에 들어감

        //null, nullPointException
        //null : heap이 빈거
        //nullPointException : 빈곳을 가르키는 것
        int[] intArray = null; //heap 초기화는 null로
        String name3 = null;

//        Integer num = null;
//        int num1 = num; nullPointException

        //참조변수 ==, !=
        String str = "나희도";
        String str1 = "나희도";
        String str2 = new String("나희도");

        System.out.println(str == str1);
        System.out.println(str1 == str2); // 주소비교, 거의 쓸일없음
        System.out.println(str1.equals(str2)); // 내용비교
    }
}
