package 배열_기본;

public class ArrayBasicEx {
    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 83;
        arr[1] = 23;
        arr[2] = 54;

        for (int i = 0; i<arr.length; i++) { // 범위 지정 가능
            arr[i] += 5; // 내용자체를 변경 가능
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int e : arr){ // 향상된 for문 : 자동순회, 요소의 값을 반복 가져옴, read only
            e += 3;
            System.out.print(e + " "); //출력만 3더해주고 내용은 그대로
        }

        String[] weeks = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
    }
}
