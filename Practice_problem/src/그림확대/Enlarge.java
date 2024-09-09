package 그림확대;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//직사각형 형태의 그림 파일이 있고,
// 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
// 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
// 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
public class Enlarge {
    public static void main(String[] args) {
        String[] arr = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        System.out.println(Arrays.toString(solution(arr, 3)));
    }

    public static String[] solution(String[] arr, int k){
        List<String> rst = new ArrayList<>();
        String mod;
        for(int i = 0; i < arr.length; i++){
            mod = arr[i].replace(".",".".repeat(k));
            mod = mod.replace("x","x".repeat(k));
            for(int j = 0; j < k; j++){
                rst.add(mod);
            }
        }
        return rst.toArray(new String[0]);
    }
}
