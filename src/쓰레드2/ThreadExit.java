package 쓰레드2;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setStop(true);
//        InteruptThread interuptThread = new InteruptThread();
//        interuptThread.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {} // sleep이 걸리면 문제가 생길수 있다.
//            interuptThread.interrupt();
    }
}
        class RunThread extends Thread {
            private boolean stop;

            public void setStop(boolean stop) {
                this.stop = stop;
            }

            @Override
            public void run() {
                while (!stop) {
                    System.out.println("Thread 실행중");
                }
                System.out.println("자원 정리중...");
                System.out.println("실행종료");
            }
        }
        class InteruptThread extends Thread {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("쓰레드 실행 중...");
                        Thread.sleep(1); // interrupt를 걸어주기 위해
                    }
                } catch (InterruptedException e) {
                    System.out.println("인터럽트 발생");
                }
                System.out.println("자원 정리 중...");
                System.out.println("실행 종료");
            }
        }
