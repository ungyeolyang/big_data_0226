package 예외상황;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// 자주볼만한 예외
// ArrayIndexOutOfBoundsException : 배열의 인덱스를 넘어가는 경우
// FileNotFoundException : 존재하지 않은 파일 접근할때
// NullPointerException : Null값에 접근 할때
// ArithmeticException : 수식에 오류가 생긴경우, 주로 0으로 나눴을때
// IOException : 입출력 오류
public class ExceptionEx {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace(); // 오류 문구 출력
        } //오류를 함부로 무시하면 어떤 오류가 생길지 모름, 함부로 쓰면 안됨
        finally {
            //오류던 아니던 무조건 실행하는 부분
        }
    }
}

