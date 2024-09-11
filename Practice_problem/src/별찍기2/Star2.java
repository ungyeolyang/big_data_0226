package 별찍기2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int input = sc.nextInt();
        for(int i = 0; i< input ; i++){
            String string = "*".repeat(input-i);
            list.add(string);
        }
        for(String i : list){
            System.out.println(i);
        }
    }
}
