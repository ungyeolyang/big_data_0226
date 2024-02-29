package 회원정보_예제;
// 이름
// 나이  1~199 사이의 정수
// 직업 1 ~ 4 사이의 정수, 1:학생 , 2:회사원, 3:무직, 4:주부
// 성별 m/M, f/F
// 최종 출력 모든 입력이 완료되면 한번에 출력
//나이, 성별, 직업에서 유효한 값이 아니면 재 입력 요구

public class MemberMain {
    public static void main(String[] args) {
        MemberInfo member = new MemberInfo();
        member.setName();
        member.setAge();
        member.setGender();
        member.setJobs();
        member.getMember();

    }
}
