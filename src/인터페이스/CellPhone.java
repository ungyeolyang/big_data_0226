package 인터페이스;

public class CellPhone implements ImageSize{
    @Override
    public void reSize(int width, int length) {
        System.out.println("핸드폰의 가로크기는 "+ width
                +" 핸드폰의 세로크기는 " + length);
    }

    @Override
    public void buttonSize() {
        System.out.println("핸드폰 버튼의 크기는 50 X 25");
    }
}

class Computer implements ImageSize{
    @Override
    public void reSize(int width, int length) {
        System.out.println("컴퓨터의 가로크기는 "+ width
                + " 컴퓨터의 세로크기는 " + length);
    }

    @Override
    public void buttonSize() {
        System.out.println("컴퓨터 버튼의 크기는 300 X 150");
    }
}
