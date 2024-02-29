package 스캐너_사용하기;

//        byte a = sc.nextByte(); 		 byte 형 입력 및 리턴
//        short b = sc.nextShort(); 		 short 형 입력 및 리턴
//        int c = sc.nextInt(); 			 int 형 입력 및 리턴
//        long d = sc.nextLong(); 		 long 형 입력 및 리턴
//        char ch = sc.next().charAt(0);  문자 입력
//
//        float e = sc.nextFloat(); 		 float 형 입력 및 리턴
//        double f = sc.nextDouble(); 	 double 형 입력 및 리턴
//
//        boolean g = sc.nextBoolean(); 	 boolean 형 입력 및 리턴
//
//        String h = sc.next(); 			 String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
//        String i = sc.nextLine(); 		 String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)

import java.util.Scanner;

public class ScnnnerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //import 안하면 java.util.Scanner sc = new java.util.Scanner(system.in)으로 해도 된다.
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next();
        sc.nextLine();//버퍼 비우기, 다음라인에 영향받는 부분에만 넣어주면됨
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine(); // 주소는 공백이 포함되기 때문
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0); // 문자를 입력 받기 위해서는 문자열에서 인덱스를 추출
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        System.out.println("=".repeat(5) + "회원정보출력" + "=".repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);

    }
}
