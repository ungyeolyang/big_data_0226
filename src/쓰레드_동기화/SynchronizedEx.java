package 쓰레드_동기화;
// 여러개의 쓰레드가 동시에 같은 자원을 접근하는 lock을 걸어
// 다른 쓰레드의 진입을 막는 것
public class SynchronizedEx {
    public static void main(String[] args) {
        // sharethread가 sleep하는 동안 2개의 tread가 동시에 값을 변경하기때문에 같은 값으로 변경됨
        ShareTread thread = new ShareTread();
        Thread thread1 = new Thread(()->{
            thread.setValue(100);
        });
        Thread thread2 = new Thread(()->{
            thread.setValue(10);
        });

        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }
}

class ShareTread{
    private int value = 0;
    public int getValue(){
        return value;
    }
    public synchronized void setValue(int value){ //자동으로 하나를 lock 걸어줘서 sleep인 상태에도 값을 보장
        this.value = value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "의 Value 값은 " + this.value + "입니다.");
    }
}
