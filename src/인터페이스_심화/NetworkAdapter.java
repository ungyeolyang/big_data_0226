package 인터페이스_심화;

public interface NetworkAdapter {
    void connect(); //public abstract 자동으로 추가
}

class Wifi implements NetworkAdapter{
    String company;
    Wifi(String company){
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "Wifi에 연결 되었습니다.");
    }
}

class FiveG implements NetworkAdapter{
    String company;
    FiveG(String company){
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "5G에 연결 되었습니다.");
    }
}

class Lte implements NetworkAdapter{
    String company;
    Lte(String company){
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "Lte에 연결 되었습니다.");
    }
}

