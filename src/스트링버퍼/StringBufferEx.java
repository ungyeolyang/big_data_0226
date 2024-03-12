package 스트링버퍼;
//StringBuffer, StringBuilder는 문자열을 추가 하거나 변경할때 사용
//동일한 기능을 하는 String을 사용하면 간결하긴하지만 메모리 측면에서 유리함
public class StringBufferEx {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("abjump to java");
        sb.delete(0,1);
        sb.insert(0, "hello ");
        System.out.println(sb);

        String result = "";
        result += "hello";
        result += " ";
        result += "jump to java";
        System.out.println(result); //4개의 String 객체가 생성됨

        StringBuilder sB = new StringBuilder();
        sB.append("hello");
        sB.append(" ");
        sB.append("jump to java");
        System.out.println(sB);
    }
}
