package 연습문제_행사안내;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("제목을 입력하세요");
        String title = sc.next();
        System.out.println("날짜을 입력하세요 ex) YYYYMMDD");
        String date = sc.next();
        System.out.println("시간을 입력하세요 ex)TT");
        String time = sc.next();

        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6,8);
        String greeting = ""; // 빈문자열로 초기화

        switch (month){
            case "12":
                greeting = "한파의 연속인 12월 입니다.";
                break;
            case"01":
                greeting = "한파의 연속인 1월 입니다.";
                break;
            case "02":
                greeting = "겨울이 끝나가는 2월 입니다.";
                break;
            case "3":
                greeting = "봄의 기운이 느껴지는 3월 입니다.";
                break;
            case "4":
                greeting = "새싹이 피어나는 4월 입니다.";
                break;
            case "5":
                greeting = "계절의 여왕 5월 입니다.";
                break;
            case "6":
                greeting = "활동하기 좋은 6월 입니다.";
                break;
            case "7":
                greeting = "휴가가 기다려지는 7월 입니다.";
                break;
            case "8":
                greeting = "무더운 8월 입니다.";
                break;
            case "9":
                greeting = "선선한 9월 입니다.";
                break;
            case "10":
                greeting = "천고마비의 계절 10월 입니다.";
                break;
            case "11":
                greeting = "쓸쓸한 늦가을 11월 입니다.";
                break;
            default:
                System.out.println("알 수 없는 월 입니다");
        }

        //출력
        System.out.println(name +"님.");
        System.out.println(greeting);
        System.out.println("아래와 같은 일정으로 " + title + "를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.\n");
        System.out.println("=".repeat(5)+ "행사 안내" + "=".repeat(5));
        System.out.println("행사 안내 : " + title);
        System.out.println("일시 : " + year + "년 "+ month + "월 " + day);
        System.out.println("시간 : " + time + "시");
    }
}
