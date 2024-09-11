package 모음의개수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            String input = sc.nextLine();
            int count = 0;
            if(input.equals("#")){
                break;
            }
            for(int i=0; i< input.length(); i++){
                if(input.toLowerCase().charAt(i) == 'a'||
                        input.toLowerCase().charAt(i) =='e'||
                        input.toLowerCase().charAt(i) =='i'||
                        input.toLowerCase().charAt(i) =='o'||
                        input.toLowerCase().charAt(i) =='u') {
                    count++;
                }
            }
            list.add(count);
        }
        for(int i : list){
            System.out.println(i);
        }
    }
}
