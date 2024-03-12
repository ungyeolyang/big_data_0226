package 클론;
// 얕은 복사가 일어 날 상황에서 깊은 복사가 일어나도록 해주는 메소드
public class CloneEx implements Cloneable {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 23, true);
//        Member mem2 = mem1; // 얕은 복사가 발생해 둘다 변경됨
        Member mem2 = mem1.getMember();
        mem2.age = 100;
        mem2.name = "test";

        System.out.println("name : " + mem1.name);
        System.out.println("name : " + mem2.name);

        System.out.println("name : " + mem1.age);
        System.out.println("name : " + mem2.age);
    }
}
class Member implements Cloneable {
        public String id;
        public String name;
        public String password;
        public int age;
        public boolean adult;

        public Member(String id, String name, String password, int age, boolean adult) {
            this.id = id;
            this.name = name;
            this.password = password;
            this.age = age;
            this.adult = adult;
        }
        public Member getMember() {
            Member cloned = null;
            try {
                cloned = (Member) clone(); // 클론 메서드는 Object타입이므로 Member 타입으로 변경
            } catch (CloneNotSupportedException e) { } // conable 안해주면 생기는 오류
            return cloned;
        }
    }
