package 데이터베이스;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class LogInDAO {
    static String id;
    static String nickName;
    public void logIn() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("로그인을 위해 아이디와 비밀번호를 입력 하세요.");
            try {
                conn = Common.getConnection();
                stmt = conn.createStatement();

                while (true) {
                    System.out.print("아이디 : ");
                    id = sc.next().trim();
                    System.out.print("비밀번호 : ");
                    String pw = sc.next().trim();
                    String query = "SELECT USER_ID, USER_PW, USER_NICK FROM MEMBER WHERE USER_ID = '" + id +"'";
                    rs = stmt.executeQuery(query);
                    if (rs.next()) {
                        if (!pw.equals(rs.getString("USER_PW"))) {
                            System.out.println("잘못된 비밀번호 입니다. ");
                            continue;
                        }
                        nickName = rs.getString("USER_NICK");
                    }
                    else {
                         System.out.println("없는 아이디입니다. ");
                         continue;
                     }

                    System.out.println("로그인 성공.");
                    break;
                    }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);
    }
}