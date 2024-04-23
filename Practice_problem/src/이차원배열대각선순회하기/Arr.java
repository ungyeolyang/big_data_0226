package 이차원배열대각선순회하기;
//2차원 정수 배열 board와 정수 k가 주어집니다.
// i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.
public class Arr {
    public static void main(String[] args) {
       int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
       int k = 2;
       System.out.println(solution(board,k));
    }
    public static int solution(int[][] board, int k){
        int sum = 0;
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if((i+j) <= k) sum = sum + board[i][j];
            }
        }
        return sum;
    }
}
