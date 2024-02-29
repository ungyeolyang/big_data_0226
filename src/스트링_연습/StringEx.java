package 스트링_연습;

public class StringEx {
    public static void main(String[] args) {
        String a = "Hello Java"; // 리터럴 상수
        String b = "Hello Java";
        String c = new String("hello java");
        String d = new String("Hello Java");

        System.out.println("=".repeat(5)+" == "+"=".repeat(5));
        System.out.println(a == b); // 주소 비교, 같은 리터럴 상수는 같은 주소
        System.out.println(c == d); //다른 인스턴스는 다른 주소
        System.out.println(a == d);

        System.out.println("=".repeat(5)+" equals "+"=".repeat(5));
        System.out.println(a.equals(c)); // 문자열 비교
        System.out.println(a.equalsIgnoreCase(c)); // 대소문자 무시
        System.out.println(a.equals(d));

        System.out.println("=".repeat(5)+" indexOf "+"=".repeat(5));
        System.out.println(a.indexOf("Java")); // 특정문자가 시작되는 인덱스 반환
        System.out.println(a.indexOf('l'));

        System.out.println("=".repeat(5)+" contains "+"=".repeat(5));
        System.out.println(d.contains("Hello")); // 특정문자가 포함되있는지 bool로 반환
        System.out.println(d.contains("Hellow"));

        System.out.println("=".repeat(5)+" charAt "+"=".repeat(5));
        System.out.println(c.charAt(6)); //위치 문자를 반환

        System.out.println("=".repeat(5)+" replace "+"=".repeat(5));
        System.out.println(b.replace("Java","World")); // 문자열을 다른 문자열로 대체
        System.out.println(b.replaceAll("\\s",""));// 문자열을 정규식 사용으로 대체

        System.out.println("=".repeat(5)+" subString "+"=".repeat(5));
        System.out.println(a.substring(0,5)); // 인덱스 시작점부터 끝점까지 문자열 추출
        System.out.println(a.substring(5)); // 인덱스 시작점부터 문자열 끝까지 문자열 추출

        System.out.println("=".repeat(5)+" toUpperCase "+"=".repeat(5));
        System.out.println(a.toUpperCase() == b); // 문자열모두를 대문자로, 주소가 바뀐다.
        System.out.println(a.toLowerCase().equals(c)); // 문자열모두를 소문자로, 내용이 같아진다.

        System.out.println("=".repeat(5)+" trim "+"=".repeat(5));
        String t = "    hello java   ";
        System.out.println(t.trim()); // 앞뒤의 빈칸 제거, 로그인할때 유용

        System.out.println("=".repeat(5)+" split "+"=".repeat(5));
        String time = "12:34:24";
        String[] rst = time.split(":"); //""를 기준으로 나눠서 반환
        System.out.println(rst[0] + "시 "+ rst[1] +"분 " + rst[2] +"초");

        System.out.println("=".repeat(5)+" format "+"=".repeat(5));
        int number = 10;
        String day = "three";
        System.out.printf("I ate %d apples. so I was sick for %s days.\n", number, day);
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));

        System.out.println("=".repeat(5)+" toCharArray "+"=".repeat(5)); //문자열을 문자 배열로 변환
        String addr = "Seoul Gangnamgu";
        char[] addrCh = addr.toCharArray();
        for(char e : addrCh){
            System.out.print(e + " ");
        }

    }
}
