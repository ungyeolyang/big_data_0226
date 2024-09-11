package 크냐;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0 && y == 0){
                break;
            }
            if(x>y){
                list.add("Yes");
            }else{
                list.add("No");
            }
        }
        for(String i : list){
            System.out.println(i);
        }

    }
}
