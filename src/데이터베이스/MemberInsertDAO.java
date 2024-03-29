package 데이터베이스;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class MemberInsertDAO {
    public void memberInsert() {
        Connection conn = null;
        Statement stmt = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입 정보를 입력 하세요 ");
        System.out.print("이름 : ");
        String USER_NAME = sc.next().trim();
        System.out.print("아이디 : ");
        String USER_ID = sc.next().trim();
        System.out.print("비밀번호 : ");
        String USER_PW = sc.next().trim();
        System.out.print("닉네임 : ");
        String USER_NICKNAME = sc.next().trim();

        String query = "INSERT INTO MEMBER VALUES ("
                 +"'"+ USER_ID +"'"+ ", " + "'"+ USER_PW + "'" + ", " + "'" +
                USER_NAME + "'" + ", " +"'" + USER_NICKNAME +"'"+ ")";

        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            int ret = stmt.executeUpdate(query);
            System.out.println("Return : " + ret);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Common.close(stmt);
        Common.close(conn);

    }
}
