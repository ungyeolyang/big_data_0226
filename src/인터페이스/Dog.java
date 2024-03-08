package 인터페이스;

public class Dog implements Animal {
   public void sound(){
        System.out.println("강아지는 멍멍");
    }
    public void eat(){
       System.out.println("먹습니다.");
    }
}

class Cat implements Animal {
    public void sound(){
        System.out.println("고양이는 야옹");
    }

}

class Cow implements Animal {
    public void sound(){
        System.out.println("소는 음매");
    }
}
