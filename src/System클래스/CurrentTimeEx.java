package System클래스;

import static java.lang.Thread.sleep;

// currentTimeMills() 1970년 1월 1일 0시 0분 0초를 기준으로 현재 지나온 시간을 반환
// 성능측정할 때 주로 사용
public class CurrentTimeEx {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0;

        int randVal = (int)((Math.random() * 1000)+1);
        for(int i = 0; i < data.length; i++){
            data[i] = i+1;
        }

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < data.length; i++) {
            cnt++;
            sleep(1); // 너무빨리 끝나지 않도록 지연
            if(randVal == data[i]){
                System.out.println("위치 : " + i+1);
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("검색에 소요된 시간 : " + (endTime - startTime) + "밀리초");
    }
}
