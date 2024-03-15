package 예외상황2;

import java.io.FileWriter;
import java.io.IOException;

public class ExcpetionEx2 {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("test.txt");
//            fw.write("곰돌이 사육사");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (fw != null) { // 파일이 열렸으면 null 이 아님
                try {
                    fw.close(); // 값을 입력했으면 close가 필요함.
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
