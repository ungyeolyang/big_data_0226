package 스트림_기본;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//스트림의 동작은 생성 -> 중간연산 -> 최종연산
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        List<Integer> arList = new ArrayList<>(Arrays.asList(arr));
        //.생성.중간연산.최종연산
//        arList.stream().filter(s -> s >= 5).forEach(s -> System.out.print(s + " "));
        int sum = arList.stream().mapToInt(e -> e).sum();
//        int sum = arList.stream().reduce(0, Integer::sum);
        int count = (int) arList.stream().count();

        System.out.println("합계 : " + sum);
        System.out.println("횟수 : " + count);
    }
}
