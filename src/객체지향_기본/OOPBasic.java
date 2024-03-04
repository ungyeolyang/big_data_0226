package 객체지향_기본;

//접근 제한자
//public
//protected 같은 패키지내, 부모자식
//default 같은 패키지내
//private 같은 class내

//반환타입
public class OOPBasic {
    public static void main(String[] args) {
    Student s1 =  new Student();
    Student s2 =  new Student("안유진","서울시 강남구");
    //s1.studentName = "곰돌이사육사"; // private라 접근 불가
    //s1.address = "경기도 수원시";
        s1.setStudentName("곰돌이사육사");
        s1.setAddress("경기도 수원시");

    s1.showStudentInfo();
    s2.showStudentInfo();
    }
}

class Student{
    int studentId; // 인스턴스 필드
    private String studentName;
    int grade;
    String address;

    Student(){}
    Student(String name,String address){
        studentName = name;
        this.address = address;
    }
    public void setStudentName(String name){
        studentName = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void showStudentInfo(){
        System.out.println(studentName + ", " + address);
    }
}
