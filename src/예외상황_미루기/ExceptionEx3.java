package 예외상황_미루기;

import java.io.IOException;

public class ExceptionEx3 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
        try {
            test.input();
            test.output();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    class IOSample{
        private int num;
        public void input() throws IOException { // 상위에서 예외 처리를 해주도록 던진다.
            num = System.in.read();
        }
        public void output(){
            System.out.println(num);
        }
    }


