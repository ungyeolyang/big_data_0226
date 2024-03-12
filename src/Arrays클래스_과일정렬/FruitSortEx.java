package Arrays클래스_과일정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 과일이름을 길이순으로 정렬하고 길이가 같은경우 사전순 정렬
// compare 두개의 매개변수를 받아 값을 비교
public class FruitSortEx {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};

        Comparator<String> comp = new Comparator<String>() { //익명의 객체
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; // 정렬조건, 오름차순
//                if(o1.length() < o2.length()) return 1; // 내림차순
                else {
                    if(o1.length() == o2.length()){
                        return o1.compareTo(o2);
                    }
                    return -1; // 현상태 유지
                }
            }
        };
        Arrays.sort(fruit, comp);
        System.out.println(Arrays.toString(fruit));

        List<String> list = Arrays.asList(fruit); // 배열을 리스트로 만들기
    }
}
