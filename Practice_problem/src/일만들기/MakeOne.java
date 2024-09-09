package 일만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다.
// 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
// 10 / 2 = 5
// (5 - 1) / 2 = 2
// 2 / 2 = 1
//위와 같이 3번의 나누기 연산으로 1이 되었습니다.
//정수들이 담긴 리스트 num_list가 주어질 때, num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 return하도록 solution 함수를 완성해주세요.

public class MakeOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 4, 15, 1, 14));
        int count = 0;
        int num = 0;
        for (Integer e : list) {
            num = e;
            while (true) {
                if (num == 1) break;
                if (num % 2 == 0) {
                    count++;
                    num = num / 2;
                } else {
                    num = (num - 1) / 2;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}