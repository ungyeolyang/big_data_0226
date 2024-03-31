package 데이터베이스;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MyInfoDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public MemberVO myInfo() {
        MemberVO vo = null;
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT RPAD(SUBSTR(USER_PW,1,3),LENGTH (USER_PW),'*') AS \"USER_PW\",USER_NAME,USER_NICK FROM MEMBER WHERE USER_ID = '" + Main.myId + "'";
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("USER_NAME");
                String pw = rs.getString("USER_PW");
                String nickName = rs.getString("USER_NICK");

                vo = new MemberVO();
                vo.setName(name);
                vo.setPw(pw);
                vo.setNickName(nickName);
            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return vo;
    }

    void updateMyInfo() {
        String query = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]이름, [2]비밀번호,[3]닉네임,[4]돌아가기");
        int sel1 = sc.nextInt();
        switch (sel1) {
            case 1:
                System.out.print("이름 : ");
                String name = sc.next().trim();
                query = "UPDATE MEMBER "
                        + " SET USER_NAME = " + "'" + name + "'"
                        + " WHERE USER_ID = " + "'" + Main.myId + "'";
                break;
            case 2:
                while (true) {
                    System.out.print("비밀번호 : ");
                    String pw = sc.next().trim();
                    if (pw.length() <= 3) {
                        System.out.println("비밀번호는 4자 이상이어야 합니다.");
                        continue;
                    }
                    query = "UPDATE MEMBER "
                            + " SET USER_PW = " + "'" + pw + "'"
                            + " WHERE USER_ID = " + "'" + Main.myId + "'";
                    break;
                }
                break;
            case 3:
                System.out.print("닉네임 : ");
                String nickName = sc.next().trim();
                query = "UPDATE MEMBER "
                        + " SET USER_NICK = " + "'" + nickName + "'"
                        + " WHERE USER_ID = " + "'" + Main.myId + "'";
                Main.myNickName = nickName;
                break;
            case 4:
                return;
            default:
                break;
        }
    }

    void deleteMyInfo() {
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "DELETE FROM MEMBER WHERE USER_ID = '" + Main.myId + "'";
            int ret = stmt.executeUpdate(query);
            System.out.println("Return : " + ret);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Common.close(stmt);
        Common.close(conn);
    }
    void printMyInfo(MemberVO vo) {
            System.out.println(Main.myNickName +"님의 정보");
            System.out.println("=".repeat(10));
            System.out.println("이름 : " + vo.getName());
            System.out.println("비밀번호 : " + vo.getPw() + " ");
            System.out.println("닉네임 : " + vo.getNickName() + " ");
    }

}
