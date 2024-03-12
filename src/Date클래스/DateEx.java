package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 운영체제로부터 시간을 읽어 오는 클래스. 반드시 객체를 생성해서 사용
public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        // 원하는 포멧으로 시간으로 출력하기 위해서 SimpleDataFormet 사용

        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd"); // 분은 m 월 M, 두자리로 표현하기위해 MM
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        f4 = new SimpleDateFormat("HH:mm:ss"); //HH 24시간
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다."); // 달단위
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다."); // 연단위

        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

        //calender data 클래스의 단점을 보완하기위해 나옴
        //추상클래스로 특정 국가나 문화의 달력시스템에 맞게 하위 클래스에서 구현
        Calendar now1 = Calendar.getInstance(); // 필드 값을 가져옴
        System.out.print(now1.get(Calendar.YEAR) + " ");
        System.out.print(now1.get(Calendar.MONTH)+1 + " "); // 배열의 인덱스로 가지고 옴
        System.out.print(now1.get(Calendar.DAY_OF_MONTH)+ " ");
        System.out.print(now1.get(Calendar.DAY_OF_WEEK)+ " ");
        System.out.print(now1.get(Calendar.AM_PM)+ " ");
        System.out.print(now1.get(Calendar.HOUR)+ " ");
        System.out.print(now1.get(Calendar.MINUTE)+ " ");
        System.out.print(now1.get(Calendar.SECOND)+ " ");
        System.out.println();

        //Calendar 클래스로 yyyy년MM월dd HH시mm분ss초 포맷과 동일하게 출력 하기
        int year = now1.get(Calendar.YEAR);
        int month = now1.get((Calendar.MONTH)+1);
        int day = now1.get(Calendar.DAY_OF_MONTH);
        int hour = now1.get(Calendar.AM_PM) == 0 ? now1.get(Calendar.HOUR) : now1.get(Calendar.HOUR)+12;
        int minute = now1.get(Calendar.MINUTE);
        int second = now1.get(Calendar.SECOND);

        System.out.printf("%d년 %2d월 %2d일 %2d시 %2d분 %2d초",year,month,day,hour,minute,second);

    }
}
