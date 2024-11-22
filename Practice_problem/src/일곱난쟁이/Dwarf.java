package 일곱난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dwarf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int left = 0,right = 8;
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            int input = Integer.parseInt(br.readLine());
            arr[i] = input;
            sum += input;
        }
        Arrays.sort(arr);
        while(true){
            if(sum-(arr[left]+arr[right]) == 100){break;}
            if(sum -(arr[left]+arr[right])>100){
                left++;
            }else{
                right--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i == left || i == right){}
            else System.out.println(arr[i]);
        }
    }
}
