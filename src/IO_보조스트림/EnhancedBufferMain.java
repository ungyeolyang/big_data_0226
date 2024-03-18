package IO_보조스트림;

import java.io.*;

//입출력 장치가 느린 것 때문에 프로그램 동작이 느려지는 것을 환화하기 위해 사용
// fis - bis - program - bos - fos
// 버퍼를 사용하면 빨라진다.
public class EnhancedBufferMain {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = -1; // -1은 데이터의 끝을 의미
        long start = 0;
        long end = 0;
        fis = new FileInputStream("src/IO_보조스트림/고양이.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("테스트이미지.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1){
            bos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close(); // 열었던 순서의 반대로 닫는다.
        System.out.println("버퍼를 사용 하는 경우 : " + (end - start) + "ms");
    }
}
