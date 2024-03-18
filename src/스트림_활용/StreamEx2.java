package 스트림_활용;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        TravelCustomer tc1 = new TravelCustomer("안유진",21,100);
        TravelCustomer tc2 = new TravelCustomer("유나",20,150);
        TravelCustomer tc3 = new TravelCustomer("지수",25,350);

        List<TravelCustomer> list = new ArrayList<>();
        list.add(tc1);
        list.add(tc2);
        list.add(tc3);
        list.add(new TravelCustomer("민지",17,80));

        System.out.println("고객 명단 순서대로 출력");
        list.stream().map(c -> c.getName()).forEach(c -> System.out.println(c));
//      list.stream().map(TravelCustomer::getName).forEach(System.out::println);
        int total = list.stream().mapToInt(c-> c.getPrice()).sum();

        System.out.println("총 여행 비용 : " + total);
        System.out.println("== 20세이상 명단 출력 ==");
        list.stream().filter(c -> c.getAge() >= 20)
                     .map(c -> c.getName())
                     .sorted()
                     .forEach(c -> System.out.println(c));

    }
}
class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
