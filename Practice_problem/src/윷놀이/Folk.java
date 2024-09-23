package 윷놀이;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Folk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            switch (sum){
                case 0: list.add('D'); break;
                case 1: list.add('C'); break;
                case 2: list.add('B'); break;
                case 3: list.add('A');break;
                case 4: list.add('E'); break;
                default: break;
            }
        }
        for(char i : list){
            System.out.println(i);
        }
    }
}
