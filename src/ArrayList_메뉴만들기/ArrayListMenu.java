package ArrayList_메뉴만들기;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMenu {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>(); // 리스트로 만들어 놓으면 벡터,링크드로 자유롭게 변경가능
        menuList.add(new MenuInfo("Americano",4500,"Coffee","커피",true));
        menuList.add(new MenuInfo("Latte",5000,"Coffee","우유",true));
        menuList.add(new MenuInfo("BlackTea",3500,"Tea","홍차",false));

        for(int i = 0; i <menuList.size(); i++){
            System.out.println(menuList.get(i).getJsonFormat());
        }
        for(MenuInfo e : menuList){ // 위와 같은 결과, get을 생략할수 있음
            System.out.println(e.getJsonFormat());
        }
    }
}

class MenuInfo {
    String name = "";
    int price;
    String category = "";
    String desc = "";
    boolean isTax;
    MenuInfo(String name, int price, String category, String desc,boolean isTax) {
        this.name = name;
        this.price = price;
        this.isTax = isTax;
    }
    public String getJsonFormat() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}
