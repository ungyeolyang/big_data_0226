package 날짜비교하기;
//정수 배열 date1과 date2가 주어집니다.
// 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
// 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
//만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
public class Compare {
    public static void main(String[] args) {
        int[] data1 = {2022, 12, 27};
        int[] data2 = {2021, 12, 29};
        System.out.println(solution(data1,data2));
    }

    public static int solution(int[] data1, int[] data2){
        if((data1[0] <= data2[0]) && (data1[1] <= data2[1]) && (data1[2] < data2[2])) return 1;
        else  return 0;
    }
}
