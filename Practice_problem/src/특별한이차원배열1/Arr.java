package 특별한이차원배열1;

import java.util.Arrays;

//정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
// arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
//n	result
//3	[[1, 0, 0], [0, 1, 0], [0, 0, 1]]
//6	[[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0],
// [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]
public class Arr {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(3)));
    }
    public static int[][] solution(int n){
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            arr[i][i] = 1;
        }
        return arr;
    }
}
