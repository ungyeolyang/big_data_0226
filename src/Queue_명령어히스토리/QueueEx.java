package Queue_명령어히스토리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
    Queue<String> queue = new LinkedList<>(); // que는 linked list 형식임
    final static int MAX_SIZE = 10; // Queue의 크기제한, 예제로 인한 제한, 굳이 할필요는 없음
    public static void main(String[] args) {
        QueueEx que = new QueueEx();
        Scanner sc = new Scanner(System.in);
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while (true){
            System.out.print("$ ");
            String cmd = sc.nextLine().trim(); // 앞뒤 공백을 입력해도 인식할수 있도록
            if(cmd.equalsIgnoreCase("q")) {
                System.exit(0);
            }
            // status로 얼마를 넣던 종료, 운영체제 입장에서 종료시키는 이유 0번이 보통
            else if(cmd.equalsIgnoreCase("help")){
                System.out.println("help - 도움말을 보여 줍니다.");
                System.out.println("q - 시스템을 종료합니다.");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
            } else if(cmd.equalsIgnoreCase("history")){
                que.save(cmd);
                int cnt = 0;
                for(String e : que.queue){
                    cnt++; // history 앞에 숫자를 보여주기 위해
                    System.out.println(cnt + " " + e);
                }
            } else {
                que.save(cmd);
                System.out.println(cmd);}
        }

    }
    void save(String cmd) {
        queue.offer(cmd);
        if(queue.size() > MAX_SIZE) queue.remove();
    }
}
