package 별찍기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int input = sc.nextInt();
        for(int i = 0; i< input ; i++){
            String string = " ".repeat(input-i-1)+"*".repeat(i+1)+" ";
            list.add(string);
        }
        for(String i : list){
            System.out.println(i);
        }
    }
}
