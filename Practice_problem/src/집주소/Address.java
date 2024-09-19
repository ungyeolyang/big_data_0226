package 집주소;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            String input = sc.nextLine();
            int count = 2;
            if(input.equals("0")){
                break;
            }
            for(int i =0; i < input.length(); i++){
                if(input.charAt(i)=='1'){
                    count+=2;
                }else if(input.charAt(i)=='0'){
                    count+=4;
                }
                else count+=3;
            }
            list.add(count+input.length()-1);
        }
        for(int i : list){
            System.out.println(i);
        }
    }
}
