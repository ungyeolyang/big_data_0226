package 연습문제_버블정렬;

public class Bubblesorting {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 8, 4, 3, 5, 2};
        int temp = 0; // 값을 임시로 담을 변수
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int e : arr) {
            System.out.print(e +" ");
        }
    }
}
