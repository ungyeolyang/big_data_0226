package 다중인터페이스;

public class MultiInterface {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();
//        buyer.sell();
        buyer.order();

        Sell seller = customer;
//        seller.buy();
        seller.sell();
        seller.order();

        customer.buy();
        customer.sell();
        customer.order();
    }
}

interface Sell{
    void sell();
    default void order(){
        System.out.println("판매 주문");
    }
}

interface Buy{
    void buy();
    default void order(){
        System.out.println("구매 주문");
    }
}

class Customer implements Sell,Buy{

    @Override
    public void sell() {
        System.out.println("고객 판매 주문");
    }

    @Override
    public void buy() {
        System.out.println("고객 구매 주문");
    }
    @Override
    public void order(){
        System.out.println("고객 주문");
        // 겹치는 default 메소드는 자식에서 재정의 해줘야 오류가 생기지 않는다.
    }
}
