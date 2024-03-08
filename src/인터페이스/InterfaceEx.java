package 인터페이스;

public class InterfaceEx {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };

        for(Animal e : animals) {
            e.sound();
        }

        System.out.println("=".repeat(5)+ " 동물 인터페이스 " + "=".repeat(5));
        Animal sichu = new Dog();
        System.out.println("시츄의 소리");
        sichu.sound();

        Animal bulldog = new Dog();
        // bulldog.eat(); 부모클래스로 받아서 에러
        System.out.println("다운 캐스팅");
        ((Dog)bulldog).eat();

        Animal persian = new Cat();
        System.out.println("페르시안의 소리");
        persian.sound();


        Animal hanu = new Cow();
        System.out.println("한우의 소리");
        hanu.sound();



        System.out.println("=".repeat(5)+ " 자동차 인터페이스 " + "=".repeat(5));
        Car bus = new Bus();
        bus.start();
        bus.stop();

        Car taxi = new Taxi();
        taxi.start();
        taxi.stop();

        System.out.println("=".repeat(5)+ " 장치 인터페이스 " + "=".repeat(5));
        Playable music = new Music();
        music.play();

        Playable video = new Video();
        video.play();

        System.out.println("=".repeat(5)+ " 이미지 인터페이스 " + "=".repeat(5));
        ImageSize cellPhone = new CellPhone();
        cellPhone.reSize(16,20);
        cellPhone.buttonSize();

        ImageSize computer = new Computer();
        computer.reSize(360,60);
        computer.buttonSize();
    }
}
