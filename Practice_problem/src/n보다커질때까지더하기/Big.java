package n보다커질때까지더하기;
//정수 배열 numbers와 정수 n이 매개변수로 주어집니다.
// numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
public class Big {
    public static void main(String[] args) {
        int[] numbers ={34, 5, 71, 29, 100, 34};
        int n = 123;
        System.out.println(solution(numbers,n));
    }
    public static int solution(int[] numbers, int n){
        int sum = 0;
        for (int e: numbers) {
            sum = sum + e;
            if(sum > n) break;
        }
        System.out.println(sum);
        return sum;
    }
}
