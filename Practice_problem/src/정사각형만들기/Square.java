package 정사각형만들기;


import java.util.Arrays;

//이차원 정수 배열 arr이 매개변수로 주어집니다.
// arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
// 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
public class Square {
    public static void main(String[] args) {
        int[][] arr = {{57, 192, 534, 2},{9, 345, 192, 999}};
        for(int[] e : solution(arr)){
            System.out.println(Arrays.toString(e));
        }
    }

    public static int[][] solution(int[][] arr){
        int[][] rst = new int[Math.max(arr.length, arr[0].length)][Math.max(arr.length, arr[0].length)];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                rst[i][j] = arr[i][j];
            }
        }
        return rst;
    }
}
