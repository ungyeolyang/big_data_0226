package 오븐;
//addh +60초
//addt +10초
//mint -10초
//addo +1초
//mino -1초
// 최소조합

import java.util.Scanner;

public class Oven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 40 보다 크면 addh mint 조합 else addt
        // 6 보다 크면 addt mino 조합 else addo

        int addh = n / 60;
        int addt = 0;
        int mint = 0;
        int addo = 0;
        int mino = 0;

        if(n%60 >= 40){ addh += 1;  mint =(60 - (n%60))/10; }
        else addt = (n%60)/10;
        if(n%10 >= 6) {addt +=1; mino = 10-(n%10);}
        else addo = n%10;

        System.out.printf("%d %d %d %d %d",addh,addt,mint,addo,mino);
    }
}
