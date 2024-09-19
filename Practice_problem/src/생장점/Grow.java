package 생장점;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            int count = 1;
            int num = sc.nextInt();
            if(num == 0){break;}
            for(int i = 0; i < 2 * num; i++){
                if(i%2==0){
                    count *= sc.nextInt();
                }else count -= sc.nextInt();
            }
            list.add(count);
        }
        for(int i: list){System.out.println(i);}
    }
}
