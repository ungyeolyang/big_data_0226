package HashMap_커피메뉴;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenuMain {
    static Map<String,MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }
    static void makeMenu(){
        map.put("Americano", new MenuInfo("Americano", 4500,"Coffee","기본"));
        map.put("Espresso", new MenuInfo("Espresso", 5000,"Coffee","진한 커피"));
        map.put("Latte", new MenuInfo("Latte", 5500,"Coffee","우유 포함"));
    }
    static void selectMenu(){
        Scanner sc = new Scanner(System.in);
        String key;

        while(true){
            System.out.println("메뉴를 선택하세요.");
            System.out.print("[1]보기 [2]조회 [3]추가 [4]수정 [5]삭제 [6]종료 : ");
            int selManu = sc.nextInt();
            switch (selManu){
                case 1:
                    System.out.println("=".repeat(7) + " 메뉴보기 " + "=".repeat(7));
                    for(String e : map.keySet()){
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).category);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("=".repeat(20));
                    }
                    break;

                case 2:
                    System.out.println("조회할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                    System.out.println("메뉴 : " + map.get(key).name);
                    System.out.println("가격 : " + map.get(key).price);
                    System.out.println("분류 : " + map.get(key).category);
                    System.out.println("설명 : " + map.get(key).desc);
                    System.out.println("=".repeat(20));
                    }
                    else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;

                case 3:
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) System.out.println("해당 메뉴가 이미 존재합니다.");
                    else {
                        System.out.print("가격을 입력하세요 : ");
                        int price = sc.nextInt();
                        System.out.print("분류를 입력하세요 : ");
                        String category = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명을 입력입력하세요 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key,price,category,desc));
                    }
                    break;

                case 4:
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).category);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("=".repeat(20));
                        System.out.print("수정할 가격을 입력하세요 : ");
                        int price = sc.nextInt();
                        System.out.print("수정할 분류를 입력하세요 : ");
                        String category = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("수정할 설명을 입력입력하세요 : ");
                        String desc = sc.nextLine();
                        map.replace(key, new MenuInfo(key,price,category,desc));
                    }
                    else System.out.println("수정할 메뉴가 없습니다.");
                    break;

                case 5:
                    System.out.println("삭제할 메뉴를 입력하세요");
                    key = sc.next();
                    if(map.containsKey(key)){
                        map.remove(key);
                        System.out.println(key + "메뉴를 삭제했습니다.");
                    }
                    else System.out.println("삭제할 메뉴가 없습니다.");
                    break;

                case 6: System.out.println("메뉴를 종료 합니다."); return;
            }
        }
    }
}
