package Comparable예제;

import java.util.Comparator;
import java.util.TreeSet;

//내부 객체들을 정렬하는데 사용되는 인터페이스
//comparable : 자기 자신과 외부로부터 전달된 객체를 비교
//comparator : 두개의 객체를 전달받아 비교
public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarCompare> list = new TreeSet<>(); //compareTo조건으로 알아서 트리로 만들어줌
        list.add(new CarCompare("Santafe",2016,"흰색"));
        list.add(new CarCompare("Sonata",2012,"은색"));
        list.add(new CarCompare("Grandeur",2018,"검정"));
        list.add(new CarCompare("Morning",2012,"흰색"));


        for(CarCompare e : list) {
            System.out.println(e.modelName);
        }
    }
}
