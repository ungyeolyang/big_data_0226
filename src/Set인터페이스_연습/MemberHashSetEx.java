package Set인터페이스_연습;

import java.util.HashSet;

//객체(인스턴스)주소가 같아야 같은 객체
public class MemberHashSetEx {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member m1 = new Member(1001, "유나");
        Member m2 = new Member(1002, "채영");
        Member m3 = new Member(1003, "지수");

        hashSet.add(m1);
        hashSet.add(m2);
        hashSet.add(m3);
        hashSet.add(new Member(1003, "지수"));
        // 밑에 오버라이딩을 안해주면 내용이 같아도 주소가 다르기때문에 다른 객체로 인식
        for (Member e : hashSet){
            e.showMember();
        }

    }
}

class Member{
    int id;
    String name;

    Member(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void showMember(){
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }

    @Override
    public int hashCode() { // 주소값을 아이디로 바꿈
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    } // 주소가 같고 내용이 같아야 동일한 객체로 인식

}
