package 싱글톤;

public class SingletonEx {
    public static void main(String[] args) {
        Singleton.getSingleton();
        SingletonTest1 test1 = new SingletonTest1();
        SingletonTest2 test2 = new SingletonTest2();

        test1.setInfo("동그라미",27);
        test2.viewInfo();
    }
}
