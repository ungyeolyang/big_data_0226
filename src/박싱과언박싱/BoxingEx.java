package 박싱과언박싱;

public class BoxingEx {
    public static void main(String[] args) {
        Integer num = new Integer(17); // 박싱
        int n = num.intValue(); // 언박싱

        Integer num1 = 17; //오토 박싱
        int n1 = num1; //오토 언박싱
    }
}
