package 은행만들기;

public class BankMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오",2000);
        Bank shinhan = new Bank("신한",2000);
        Bank gukmin = new Bank("국민",0);
        kakao.setDeposit(3000);
        kakao.viewAccount();

        shinhan.setWithDraw(1500);
        shinhan.viewAccount();

        gukmin.setWithDraw(100);
        gukmin.viewAccount();

        System.out.println("개설한 계좌: " +Bank.getCount() + "개");

    }
}
