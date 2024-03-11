package 코코아톡만들기;
public interface NetworkAdapter {
    void connect(); // interface는 public abstract가 자동적으로 추가됨
    void send(String msg);
}

class Wifi implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("Wifi에 연결되었습니다.");
    } // 내용이 없더라도 생성만 하면 된다.

    @Override
    public void send(String msg) {
        System.out.println("Wifi >> " +msg);
    }
}

class FiveG implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("5G에 연결되었습니다.");
    } // 내용이 없더라도 생성만 하면 된다.

    @Override
    public void send(String msg) {
        System.out.println("5G >> " +msg);
    }
}

class Lte implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("Lte에 연결되었습니다.");
    } // 내용이 없더라도 생성만 하면 된다.

    @Override
    public void send(String msg) {
        System.out.println("Lte >> " +msg);
    }
}
