package TreeSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

//컬랙션 프레임워크는 검색기능을 강화시킨 TreeSet과 TreeMap 제공
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        // Enhanced for 문
        for (int e : ts) System.out.print(e + " ");

        ts.remove(48);// 있으면 삭제
        System.out.println();
        // iterator() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = ts.iterator();
        while (iter.hasNext()) System.out.print(iter.next() + " ");

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("이진 검색 트리의 크기 : " + ts.size());

        // subSet() 메소드를 이용한 부분 집합의 출력
        System.out.println(ts.subSet(10, 20)); // 10과 20사이의 수

        Integer[] score = {78, 45, 60, 54, 92};
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(score));
        System.out.println(treeSet);

        System.out.println("60점 이하 : " + treeSet.headSet(60));
        System.out.println("60점 이상 : " + treeSet.tailSet(60));

        // 주어진 점수 보다 바로 아래 점수
        System.out.println("60점 이하 : " + treeSet.lower(60));
        // 주어진 점수 보다 바로 위의 점수
        System.out.println("60점 이상 : " + treeSet.higher(60));
    }
}
