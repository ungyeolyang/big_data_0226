package 데이터베이스;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BoardDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public NutrientsVO boardNut() {
        int count  = 0;
        NutrientsVO voN = new NutrientsVO();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();

            while (true) {
                System.out.print("영양제 이름을 입력하세요 : ");
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine().trim();
                String query = "SELECT NUTRIENTS_NAME FROM NUTRIENTS WHERE NUTRIENTS_NAME LIKE '%" + name + "%'";
                rs = stmt.executeQuery(query);
                while (rs.next()) {
                    count++;
                    voN.setNutrientsName(rs.getString("NUTRIENTS_NAME")) ;
                }
                if (count == 0) { System.out.println("검색결과가 존재하지 않습니다.");}
                else if(count>1) { System.out.println("결과가 2개 이상입니다, 정확한 이름을 입력하세요.");}
                else break;
            }

            String query = "SELECT * FROM NUTRIENTS WHERE NUTRIENTS_NAME ="+ "'" + voN.getNutrientsName() + "'";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                voN.setIngredientA(rs.getString("INGREDIENT_A"));
                voN.setIngredientB(rs.getString("INGREDIENT_B"));
                voN.setCompany(rs.getString("COMPANY"));
                voN.setHowToTake(rs.getString("HOW_TO_TAKE"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Common.close(rs);
        Common.close(stmt);
        Common.close(conn);
        return voN;
    }

    public HashSet<String> boardEFF(NutrientsVO vo) {
        HashSet<String> set = new HashSet<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();

            String query1 = "SELECT EFFICACY_A ,EFFICACY_B ,EFFICACY_C " +
                    "FROM NUTRIENTS n JOIN INGREDIENT i ON i.INGREDIENT_NAME = n.INGREDIENT_A OR i.INGREDIENT_NAME = n.INGREDIENT_B " +
                    "WHERE NUTRIENTS_NAME LIKE '%" + vo.getNutrientsName() + "'";
            rs = stmt.executeQuery(query1);
            while (rs.next()){
                set.add(rs.getString("EFFICACY_A"));
                set.add(rs.getString("EFFICACY_B"));
                set.add(rs.getString("EFFICACY_C"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Common.close(rs);
        Common.close(stmt);
        Common.close(conn);
        return set;
    }

    public List<BoardVO> boardList(NutrientsVO voN) {
        BoardVO voB = new BoardVO();
        List<BoardVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();

          String query = "SELECT USER_NICK,RPAD(SUBSTR(USER_ID,1,3),LENGTH (USER_ID),'*') AS \"USER_ID\",CONTENT " +
                    "FROM BOARD WHERE NUTRIENTS_NAME = '" + voN.getNutrientsName() +"'";

            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String nick = rs.getString("USER_NICK");
                String id = rs.getString("USER_ID");
                String content = rs.getString("CONTENT");

                voB.setUserNick(nick);
                voB.setUserId(id);
                voB.setContent(content);

                list.add(voB);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Common.close(rs);
        Common.close(stmt);
        Common.close(conn);
        return list;
    }

    void comment(NutrientsVO vo){
        String query = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("댓글 : ");
            String content = sc.nextLine().trim();
            if (content.isEmpty()) {System.out.println("내용을 입력하세요.");continue;}
            query = "INSERT INTO BOARD VALUES (SEQ_COMMENT.NEXTVAL, '"
                    + vo.getNutrientsName() + "', '" + Main.myId + "' , '" +
                    Main.myNickName + "' , '" + content + "')";
            break;
            }

        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            }
        catch (Exception e) {
            e.printStackTrace();
            }

        Common.close(rs);
        Common.close(stmt);
        Common.close(conn);
    }

    void updateContent(){
        Scanner sc = new Scanner(System.in);

        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();

            while (true) {
                System.out.print("수정할 글번호를 입력하세요 : ");
                String num = sc.next().trim();
                String query = "SELECT * FROM BOARD WHERE USER_ID = '" + Main.myId + "' AND COMMENT_NO = '" + num +"'";
                rs = stmt.executeQuery(query);
                if(!rs.next()) {System.out.println("존재하지 않는 글입니다."); continue;}

                System.out.print("내용 : ");
                String content = sc.nextLine().trim();
                String query1 = "UPDATE BOARD SET CONTENT = " + "'" + content + "' "
                        +"WHERE COMMENT_NO = '" + num + "'";

                int ret = stmt.executeUpdate(query1);
                System.out.println("Return : " + ret);
                break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Common.close(stmt);
        Common.close(conn);
    }

    void deleteContent() {
        Scanner sc = new Scanner(System.in);
        String query1;
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            while (true) {
                System.out.print("삭제할 글번호를 입력하세요 : ");
                String num = sc.next().trim();
                String query = "SELECT * FROM BOARD WHERE USER_ID = '" + Main.myId + "' AND COMMENT_NO = '" + num +"'";
                rs = stmt.executeQuery(query);
                if(!rs.next()) {System.out.println("존재하지 않는 글입니다."); continue;}
                query1 = "DELETE FROM BOARD WHERE COMMENT_NO = '"+ num + "'";
                break;
            }

            int ret = stmt.executeUpdate(query1);
            System.out.println("Return : " + ret);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Common.close(stmt);
        Common.close(conn);

    }

    void printBoard(NutrientsVO vo, HashSet<String> set, List<BoardVO> list) {
            System.out.println(vo.getNutrientsName());
            System.out.println("=".repeat(10));
            if(vo.getIngredientB() != null) System.out.println("성분 : " + vo.getIngredientA() + ", " + vo.getIngredientB());
            else System.out.println("성분 : " + vo.getIngredientA());
            System.out.println("효능 : " + set.toString().replace("[","").replace("]",""));
            System.out.println("제조사 : " + vo.getCompany());
            System.out.println("복용법 : " + vo.getHowToTake() + " ");
            if(!list.isEmpty()) {
                for (BoardVO e : list) {
                    System.out.println("=".repeat(30));
                    System.out.println(e.getUserNick() + "(" + e.getUserId() +") : " + e.getContent());
                }
            }
    }
}
