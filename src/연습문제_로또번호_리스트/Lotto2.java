package 연습문제_로또번호_리스트;

import java.util.ArrayList;
import java.util.List;

public class Lotto2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //컬랙션 프레임워크에서 다룰예정
        while (true){
            int num = (int)(Math.random() * 45+1);
            if(!list.contains(num)) list.add(num);
            if(list.size() == 6) break;
        }
        System.out.println(list);
    }

//    HashSet<Integer>set = new HashSet<>(); // set은 중복을 허용하지 않아서 굳이 비교안해도된다.
//    while(true) {
//        int val = (int)(Math.random()* 45) + 1;
//        set.add(val);
//        if(set.size() == 6) break;
//    }
//    System.out.println(set);
}
