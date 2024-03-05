package 메소드오버로딩;
//같은 이름의 메소드를 중복하여 정의 하는것(매개변수로 구분)
//1. 메소드 이름이 같아야한다.
//2. 매개변수의 개수나 타입이 달라야 한다.
//3. 반환타입은 의미없음(해당사항 없음)

public class MethodOver {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum("Seoul","Korea"));
    }
    static int sum(int x, int y){
     return x + y;
    }
    static String sum(int x, String y, int z){ // 반환타입은 상관없음
        return x + y + z;
    }
    static int sum(int x, int y, int z){
        return x + y + z;
    }
    static String sum(String x, String y){
        return x + y;
    }
}
