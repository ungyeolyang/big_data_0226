package 회원정보_예제;

import java.util.Scanner;

//클래스는 객체를 생성하기 위한 설계도면, 내부에 필드와 매소드가 구현됨
public class MemberInfo {
    private String name; //private는 클래스 내부에서 내부에서만 접근을 허용하는 접근제한자
    private int age;
    private char gender;
    private int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.print("이름을 입력하세요 : ");
        name = sc.next();
    }
    public void setGender() {
        while (true){
        System.out.print("성별을 입력하세요 : ");
        gender = sc.next().charAt(0);
        switch (gender) {
            case 'm':
            case 'M':
            case 'f':
            case 'F':
                return;
            default:
                System.out.println("잘못된 입력입니다.");
           }
        }
    }
    public int getGenderType(){
        if (gender == 'M'|| gender == 'm') return 1;
        else return 2;
    }
    public void setAge(){
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age>0 && age<200) return; // return은 해당 메소드를 호출한 곳으로 반환값을 반환
            else System.out.println("잘못된 입력입니다.");
        }
    }

    public void setJobs(){
        while (true){
            System.out.print("직업을 입력하세요 : ");
            jobs = sc.nextInt();
            if(jobs > 0 && jobs <5) break;
            System.out.println("잘못된 입력입니다.");
        }
    }
    public void getMember(){
        String[] genderStr ={"","남성","여성"}; // 처음 비워두는건 취향
        String[] jobsStr ={"","학생","회사원","무직","주부"};
        System.out.println("=".repeat(5) + "회원정보" + "=".repeat(5));
        System.out.println(name);
        System.out.println(age);
        System.out.println(genderStr[getGenderType()]);
        System.out.println(jobsStr[jobs]);
    }
}
