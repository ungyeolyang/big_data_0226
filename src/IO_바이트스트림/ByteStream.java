package IO_바이트스트림;
// 데이터 전송을 바이트 단위로, 동영상이나, 이미지 전송에 적합
// 최상위 클래스는 InputStream과 OutputStream

import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        OutputStream os =new FileOutputStream("test.db"); // 쓰기
        byte[] array = {10, 20, 30, 40, 50};
        byte a = 10;

        os.write(a);
        os.write(array);
        os.write(array,0,3); // 0~2번째만

        os.flush(); // 버퍼 지우기
        os.close(); // 자원 반납

        InputStream is = new FileInputStream("test.db"); // 읽기
        while (true) {
            int data = is.read(); // 한바이트씩 읽기
            if(data == -1) break;// 파일의 끝을 의미
            System.out.println(data + " ");
        }
        is.close();
    }
}
