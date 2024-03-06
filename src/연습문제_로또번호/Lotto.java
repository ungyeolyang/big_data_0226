package 연습문제_로또번호;

public class Lotto {
    public static void main(String[] args) {
        int lottoNum = (int)(Math.random() * 45 + 1); // 0~1 미만의 실수가 나옴
        int[] num = new int[6];
        num[0] = lottoNum;

        for (int i = 1; i < num.length; i++){
            lottoNum = (int)(Math.random() * 45 + 1);
                 for(int j = 0; j < i; j ++){
                     while(true) {
                         if (num[j] == lottoNum)  lottoNum = (int) (Math.random() * 45 + 1);
                         else {
                             num[i] = lottoNum;
                             break;
                         }
                     }
                }
            }

        for(int e : num){
            System.out.print(e + " ");
        }
    }
}
