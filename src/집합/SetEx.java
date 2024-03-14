package 집합;

import java.util.Arrays;
import java.util.HashSet;

// 집합은 중복 값이 없음
// 합집합 : 두집합을 합한것
// 교집합 : 두집합에서 공통된 부분
// 차집합 : 앞의 데이터에서
public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
//        s1.retainAll(s2); // 교집합을 수행하는 메소드
//        s1.addAll(s2); // 합집합을 수행
          s1.removeAll(s2); // 차집합 수행
        System.out.println(s1);

    }
}
