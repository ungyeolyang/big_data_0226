package HashMap_기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("우영우",99);
        map.put("동그라미",51);
        System.out.println("변경 전 : "+ map.get("동그라미"));
        map.put("최수연",95);
        map.put("이준호",47);
        map.put("동그라미",67);
        System.out.println("변경 후 : "+ map.get("동그라미"));
        System.out.println("containsValue(95) : " + map.containsValue(95));
        System.out.println("containsKey('동그라미') : " + map.containsKey("동그라미"));

//        Set<String> keySet = map.keySet(); // 모든 키를 Set 객체에 담아서 리턴
//        Iterator<String> iterator = keySet.iterator(); // 반복문, 그냥있다고만 알고 있자, 향상된 for문으로 대체 가능
//        System.out.println("iterator를 이용하는 방법"); // iterator는 collection 부분에 있기 때문에 set으로 옮겨서 사용, key는 중복허용이 안됨으로 중복허용이 안되는 set에 담음
//        while(iterator.hasNext()) {
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + "\t" + value);
//        } // 출력을 보면 순서 보장이 안된다.
//        System.out.println();

        for(String key : map.keySet()){ // 키만 따로 뽑아낸다.
            System.out.println(key + " " + map.get(key)); // 출력단에서 값을 출력한다.
        }
    }
}
