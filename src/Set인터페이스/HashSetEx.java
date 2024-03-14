package Set인터페이스;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
            HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o")); // 겹치는 l은 자동 삭제
            System.out.println(set);

            set.add("Java");
            set.add("C");
            set.add("C++");
            set.add("Python");
            set.add("Java"); // 겹치는 자바하나는 자동삭제

            System.out.println(set);
            for(String e : set) {
            System.out.print(e + " ");
            }
        }
    }

