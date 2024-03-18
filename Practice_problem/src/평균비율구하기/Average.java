package 평균비율구하기;

import java.util.Scanner;

// 입력받을 케이스
// 각각 첫번쨰줄에는 인원수
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] result = new double[num];
        for(int i = 0; i < result.length; i++){
            result[i] = overRate();
        }
        for(double e : result) System.out.printf("%.3f%%\n",e);

//        float avg = 0;
//        float cnt = 0;
//        float[][] arr = new float[num][1000];
//        for(int i = 0; i < num; i++){
//            for(int j = 0; j < arr[i][0]+1; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < num; i++){
//            for(int j = 1; j < arr[i][0]+1; j++){
//                avg += arr[i][j]/arr[i][0];
//            }
//            for(int j = 1; j<arr[i][0]+1; j++){
//                if(arr[i][j] > avg) cnt++;
//            }
//            float per = cnt * 100 / arr[i][0];
//            System.out.printf("%.3f%%\n",per);
//            avg = 0;
//            cnt = 0;
//        }
    }
    static double overRate(){
        Scanner sc = new Scanner(System.in);
        int studentCnt = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        double avg = (double) sum / studentCnt;

        int[] score = new int[studentCnt];
        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
        }
        for(int e : score){
            if(e > avg) cnt++;
        }
     return (double)(cnt * 100) / studentCnt;
    }
}

