package 저항;

import java.util.Scanner;

public class Regist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        String x = sc.nextLine();
        String y = sc.nextLine();
        String z = sc.nextLine();
        String result =null;
        for(int i = 0; i <color.length; i++){
            if(color[i].equals(x)){
                result = String.valueOf(i);
                break;}
        }
        for(int j = 0; j <color.length; j++){
            if(color[j].equals(y)){
                if(result.equals("0")){result=String.valueOf(j);}
                else{result+=String.valueOf(j);}
                break;}
        }
        for(int k = 0; k <color.length; k++){
            if(color[k].equals(z)){
                if(result.equals("0")){result="0";}
                else{result += "0".repeat(k);}
                break;}
        }
        System.out.println(result);
    }
}

