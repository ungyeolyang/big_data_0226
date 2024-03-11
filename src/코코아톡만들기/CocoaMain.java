package 코코아톡만들기;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
            CocoaTalk cocoaTalk = new CocoaTalk("장원영");
            cocoaTalk.writeMsg("오늘은 날씨가 따듯해요.");
            NetworkAdapter adapter;
            Scanner sc = new Scanner(System.in);
            System.out.print("네트워크 [1]Wifi [2]5G [3]Lte : ");
            int num = sc.nextInt();
            if(num == 1) adapter = new Wifi();
                else if (num == 2) adapter = new FiveG();
                    else adapter = new Lte();

            adapter.connect();
            cocoaTalk.send(adapter);
    }
}
