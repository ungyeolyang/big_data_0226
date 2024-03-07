package 은행만들기;

public class Bank {
    private static int count = 0; //클래스 내부에서만 접근 가능, 정적 필드 클래스 생성시 생성
    private  int account;
    private String name;
    Bank(String name, int account){
        count++; // 인스턴스가 생성될때 마다 불려옴
        this.name = name;
        this.account = account;
        System.out.println(name + "은행에 계좌 개설 합니다. 잔액은 " + account +"입니다.");
    }

    public static int getCount(){
        return count;
    }

    public void setDeposit(final int deposit){ // 받은 금액을 변경없이 넣기위해
        this.account += deposit;
        System.out.println( name+"은행에 "+ deposit + "을 예금 했습니다.");
    }

    public void setWithDraw(final int with){ //출금하는 내역을 변경없이 출금하기
        if(with > account){ // 출금하는 금액에 잔액보다 크면 안됨
            System.out.println("잔액이 부족합니다");
        } else{
            account -= with;
        }
    }

    public void viewAccount(){
        System.out.println( name+"은행에 "+ "현재 잔액은 " + account + "입니다.");
    }
}
