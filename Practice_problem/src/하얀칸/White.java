package 하얀칸;

import java.util.Scanner;

public class White {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i =0; i<8; i++){
            String x = sc.nextLine();
            int start =0;
            if(i%2!=0){start=1;}
            for(int j = start; j<8; j+=2){
                if (x.charAt(j) == 'F') {
                            count += 1;
                        }

            }
        }
        System.out.println(count);
    }
}
