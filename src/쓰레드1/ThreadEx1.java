package 쓰레드1;
// 동시에 여러가지 일을 병렬적으로 수행하는 것
// 1.쓰레드 클래스를 상속, 클래스 내부에 다른작업 제약
// 2.Runable 인터페이스를 상속, 실제 쓰레드는 아님
public class ThreadEx1 {
    public static void main(String[] args) {
        Thread subThread1 = new CustomThread(); // Thread를 상속한 객체 생성
        Thread subThread2 = new CustomThread();
        subThread1.start();
        System.out.println("Main Tread...");
        // 병렬처리이기 때문에 메인은 메인대로 쓰레드는 쓰레드 대로 돌기때문에 먼저찍힘
        subThread2.start();
        System.out.println("Runable...");
        Runnable task = new Sample();
        Thread subTread3 = new Thread(task); // 실제 쓰레드는 아니기때문에 쓰레드를 만들어서 동작
        subTread3.start();
        Runnable task2 = new Runnable() { // Runnable은 인터페이스 임으로 익명의 객체생성
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i<= 10; i++){
                    sum += i;
                    System.out.println(sum);
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);
            }
        };
        Thread subTread4 = new Thread(task2);
        subTread4.start();
    }
}

class CustomThread extends Thread {
    @Override
    public void run(){
        int sum = 0;
        for(int i = 0; i<= 10; i++){
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

class Sample implements Runnable{

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i<= 10; i++){
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
