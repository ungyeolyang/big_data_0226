package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// List 인터페이스 -
// ArrayList 물리적으로 연속된 저장공간 , 검색을 빠르지만 삽입 삭제할때, 멀티쓰레드 안막아줌
// Vector 멀티쓰레드 막아줌
// LinkedList의 다음연결된 주소를 가지고 있음
// 동적으로 크기가 변함, 중복저장 허용, 저장 순서가 유지
// list로 만든 것을 stack으로 만들고 싶으면 Stack stack = Arraylist<>() 처럼 list의 메소드를 stack 메소드로 제한하면됨
public class ArrayListEx {
    public static void main(String[] args) {
        List<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("98");
        pitches.add("121");
        pitches.add(0, "130"); // 특정 위치에 삽입
        System.out.println(pitches);
        System.out.println("size() : " + pitches.size());
        System.out.println("contains('142') : "+ pitches.contains("142"));
        System.out.println("get(0) : " + pitches.get(0) + ", " + "get(2) : " +pitches.get(2));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);

        String[] data = {"112","138","98","121","87"};
        List<String> pitcher = new ArrayList<>(Arrays.asList(data));
        System.out.println("remove('122') : " + pitcher.remove("122")); // 일치하는게 있으면 삭제하고 true 반환, 없으면 false 반환
        System.out.println("remove(0) : " + pitcher.remove(0)); // 해당 인덱스를 삭제하고 삭제한 값을 반환
        System.out.println(pitcher);
        pitcher.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(pitcher);
    }
}
