package 농구명단;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Basketball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap<Character,Integer> map = new HashMap<>();
        TreeSet<Character> result = new TreeSet<>();
        for(int i = 0; i< num; i++){
            Character input = sc.next().charAt(0);
            if(map.get(input)!=null){map.put(input,map.get(input)+1);}
            else {map.put(input,1);}
            if(map.get(input)==5){
                result.add(input);
            }
        }
        if(result.isEmpty()){System.out.println("PREDAJA");}
        else{
            for(char i : result){
            System.out.print(i);
            }
        }
    }
}
