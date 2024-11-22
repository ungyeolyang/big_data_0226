package 학급회장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class President {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] s1 = new int[4];
        int[] s2 = new int[4];
        int[] s3 = new int[4];
        int max = 0;
        int ect = 0;
        for (int i = 0; i < num; i++) {
            String[] score = br.readLine().split(" ");
            switch (score[0]) {
                case "3":
                    s1[1] = s1[1] + 1;
                    s1[0] = s1[0] + 3;
                    break;
                case "2":
                    s1[2] = s1[2] + 1;
                    s1[0] = s1[0] + 2;
                    break;
                case "1":
                    s1[3] = s1[3] + 1;
                    s1[0] = s1[0] + 1;
                    break;
            }
            switch (score[1]) {
                case "3":
                    s2[1] = s2[1] + 1;
                    s2[0] = s2[0] + 3;
                    break;
                case "2":
                    s2[2] = s2[2] + 1;
                    s2[0] = s2[0] + 2;
                    break;
                case "1":
                    s2[3] = s2[3] + 1;
                    s2[0] = s2[0] + 1;
                    break;
            }
            switch (score[2]) {
                case "3":
                    s3[1] = s3[1] + 1;
                    s3[0] = s3[0] + 3;
                    break;
                case "2":
                    s3[2] = s3[2] + 1;
                    s3[0] = s3[0] + 2;
                    break;
                case "1":
                    s3[3] = s3[3] + 1;
                    s3[0] = s3[0] + 1;
                    break;
            }
        }
        max = Math.max(Math.max(s1[0], s2[0]), s3[0]);
        ect = elected(max, s1, s2, s3);
        System.out.print(ect + " " + max);
    }

    private static int elected(int max, int[] s1, int[] s2, int[] s3) {
        if (s1[0] == max && s2[0] == max && s3[0] == max) {
            if(Arrays.compare(s1,s2)>0){
                if(Arrays.compare(s1,s3)>0){
                    return 1;
                }else if(Arrays.compare(s1,s3)<0){
                    return 3;
                }else return 0;
            } else if(Arrays.compare(s1,s2) == 0){
                if(Arrays.compare(s1,s3)<0){
                    return 3;
                } else return 0;
            }else {
                if(Arrays.compare(s2,s3)>0){
                    return 2;
                }else if(Arrays.compare(s2,s3)<0){

                    return 3;
                }else return 0;
            }
        }
        return 0;
    }
}
