package 객체를배열로관리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");
        int cnt = sc.nextInt();
//        NameCard[] nameCards = new NameCard[cnt]; // 객체를 저장 할 배열 생성
//
//        System.out.println("정보 입력");
//        System.out.println("----------------------");
//        for(int i = 0; i < nameCards.length; i++) {
//            nameCards[i] = new NameCard();
//            System.out.print("이름 : ");
//            nameCards[i].setName(sc.next()); // 입력을 sc.next로 바로받음
//            System.out.print("나이 : ");
//            nameCards[i].setAge(sc.nextInt());
//            System.out.print("이메일 : ");
//            nameCards[i].setMail(sc.next());
//            System.out.print("연락처 : ");
//            nameCards[i].setPhoneNumber(sc.next());
//            System.out.println();
//        }
//        for(NameCard i : nameCards) i.printInfo();

        List<NameCard> list = new ArrayList<>();
        System.out.println("정보 입력");
        System.out.println("----------------------");
        for(int i = 0; i < cnt; i++) {
            NameCard nameCard = new NameCard();

            //참조 변수 이름이 같아도 들어가는건 주소값이라 상관없음
            System.out.print("이름 : ");
            nameCard.setName(sc.next());
            System.out.print("나이 : ");
            nameCard.setAge(sc.nextInt());
            System.out.print("이메일 : ");
            nameCard.setMail(sc.next());
            System.out.print("연락처 : ");
            nameCard.setPhoneNumber(sc.next());
            System.out.println();
            list.add(nameCard);
        }
        for(NameCard i : list) i.printInfo();
    }
}
