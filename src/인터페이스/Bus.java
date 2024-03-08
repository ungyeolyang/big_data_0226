package 인터페이스;

public class Bus implements Car{
    @Override
    public void start() {
        System.out.println("버스 시동을 겁니다");
    }

    @Override
    public void stop() {
        System.out.println("버스 시동을 끕니다.");
    }
}

class Taxi implements Car{
    @Override
    public void start() {
        System.out.println("택시 시동을 겁니다");
    }

    @Override
    public void stop() {
        System.out.println("택시 시동을 끕니다.");
    }
}
