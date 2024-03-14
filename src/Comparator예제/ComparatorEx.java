package Comparator예제;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> list = new TreeSet<>(new DesendingComparator());
        list.add(new Fruit("포도",3000));
        list.add(new Fruit("사과",5000));
        list.add(new Fruit("딸기",4000));
        list.add(new Fruit("수박",7000));

        Iterator<Fruit> iter = list.iterator();
        while(iter.hasNext()){
            Fruit fruit = iter.next();
            System.out.println(fruit.name + " : " + fruit.price);
        }

        // 향상된 for문은 읽기용이라 변경이 안됨(값을 e로 복사해서 찍기때문)
        // 찍힐때는 변경해서 출력은 하나 실제 값은 그대로
        // 현대 코딩 철학 불러오는 입장에서는 변경을 못하게 하는 추세 iterator는 구식
    }
}
