package 연습문제_로또번호_배열;

public class Lotto {
    public static void main(String[] args) {
        int lottoNum; // (int)(Math.random() * 45 + 1); // 0~1 미만의 실수가 나옴
        int[] num = new int[6];

        // int index = 0; for문 개수를 줄이기 위해
        // boolean isExist = false; 반복문을 탈출하기 위한 조건
        // while(true) {
        // lottoNum = (int)(Math.random() * 45 + 1);
        // for(int i = 0; i < index; i++){
        // if(num(i) == lottoNum) isExist = true}
        // if(!isExist) num[inext++] = lottoNum;
        // if(index == 6) break;
        // isExist = false;
        // }
        //

        for (int i = 0; i < num.length; i++){
            lottoNum = (int)(Math.random() * 45 + 1);
                 for(int j = 0; j < i; j ++){
                     while(true) {
                         if (num[j] == lottoNum)  lottoNum = (int) (Math.random() * 45 + 1);
                         else break;
                     }
                }
            num[i] = lottoNum;
            }

//        int i = 0;
//        while(true) {
//            lottoNum = (int) (Math.random() * 45 + 1);

//            for (int j = 0; j < i; j++) {
//                if (num[j] == lottoNum) lottoNum = (int) (Math.random() * 45 + 1);
//                if(num[i-1] != lottoNum); break;
//            }
//            num[i++] = lottoNum;
//            if(i == 6) break;
//        } i를 밖으로 빼서 for문 줄이기

        for(int e : num){
            System.out.print(e + " ");
        }
    }
}
