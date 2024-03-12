package Arrays클래스;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//배열을 다루기 위한 다양한 메소드 포함
public class ArraysEx {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
          Arrays.sort(arr);// 오름차순
//        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순,기본타입은 안되고 객체타입이어야 가능
//        for(int e : arr){
//            System.out.print(e +" ");
//        }
        System.out.println(Arrays.binarySearch(arr,5)); // 정렬된 상태에서 5의 위치 찾기

    }
}
