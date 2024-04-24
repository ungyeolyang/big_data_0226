package 정수를나선형으로배치하기;

import java.util.Arrays;

//양의 정수 n이 매개변수로 주어집니다.
// n × n 배열에 1부터 n^2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
public class Spiral {
        public static void main(String[] args) {
        printMatrix(generateMatrix(3));
        }
        public static int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int num = 1;
            int top = 0, bottom = n - 1, left = 0, right = n - 1;

            while (num <= n * n) {
                // 왼쪽에서 오른쪽으로 이동
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = num++;
                }
                top++;

                // 위에서 아래로 이동
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = num++;
                }
                right--;

                // 오른쪽에서 왼쪽으로 이동
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;

                // 아래에서 위로 이동
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }

            return matrix;
        }
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
        }

}


