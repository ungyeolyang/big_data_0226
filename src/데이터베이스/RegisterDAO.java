package 데이터베이스;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RegisterDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public void memberInsert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입 정보를 입력 하세요.");
        System.out.print("이름 : ");
        String name = sc.next().trim();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();

            while (true) {
                System.out.print("아이디 : ");
                String id = sc.next().trim();
                String query = "SELECT USER_ID FROM MEMBER WHERE USER_ID = '" + id +"'";
                rs = stmt.executeQuery(query);
                if (rs.next()) {
                    System.out.println("이미 사용중인 아이디입니다. ");
                    continue;
                }
                while (true) {
                    System.out.print("비밀번호 : ");
                    String pw = sc.next().trim();
                    if (pw.length() <= 3) {
                        System.out.println("비밀번호는 4자 이상이어야 합니다.");
                        continue;
                    }

                    System.out.print("닉네임 : ");
                    String nickName = sc.next().trim();

                    String query1 = "INSERT INTO MEMBER VALUES ("
                            + "'" + id + "'" + ", " + "'" + pw + "'" + ", " + "'" +
                            name + "'" + ", " + "'" + nickName + "'" + ")";

                    rs = stmt.executeQuery(query1);
                    System.out.println("회원가입이 완료되었습니다.");
                    break;
                }
                break;
            }
        }
        catch(Exception e){
                    e.printStackTrace();
                }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);
    }
}
