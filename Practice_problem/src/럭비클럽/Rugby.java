package 럭비클럽;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rugby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true){
            String input = sc.nextLine();
            if (input.equals("# 0 0")) {
                break;
            }
            String[] string = input.split(" ");
            String grade = null;
            if(Integer.parseInt(string[1]) > 17 ||
                    Integer.parseInt(string[2]) >= 80){
                grade="Senior";
            } else{
                grade="Junior";
            }
            list.add(string[0] + " " + grade);
        }
        for(String i : list){
            System.out.println(i);
        }
    }
}
