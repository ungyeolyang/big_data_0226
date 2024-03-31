package 데이터베이스;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class SearchDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public TreeSet<NutrientsVO> search(){
        String query = null;
        TreeSet<NutrientsVO> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
            try {
                conn = Common.getConnection();
                stmt = conn.createStatement();

                while (true) {
                    System.out.println("[1]성분 [2]효능 [3]돌아가기");
                    int sel = sc.nextInt();
                    switch (sel) {
                        case 1:
                            System.out.println("성분을 입력하세요");
                            String ingredent = sc.next().trim();
                            query = "SELECT * FROM NUTRIENTS n JOIN INGREDIENT i ON i.INGREDIENT_NAME = n.INGREDIENT_A " +
                                    "OR i.INGREDIENT_NAME = n.INGREDIENT_B WHERE INGREDIENT_NAME LIKE" +  "'%" +ingredent + "%'";
                            break;
                        case 2:
                            System.out.print("효능을 입력하세요 : ");
                            String efficacy = sc.next().trim();
                            query = "SELECT * FROM NUTRIENTS n JOIN INGREDIENT i ON i.INGREDIENT_NAME = n.INGREDIENT_A" +
                                    " OR i.INGREDIENT_NAME = n.INGREDIENT_B WHERE EFFICACY_A LIKE '%"
                                    + efficacy + "%' OR EFFICACY_B LIKE '%" + efficacy + "%' OR EFFICACY_C LIKE '%" + efficacy + "%'";
                            break;
                        case 3: return set;
                        default:
                            continue;
                    }
                    rs = stmt.executeQuery(query);
                    if(!rs.next()){
                        System.out.println("검색결과가 존재하지 않습니다."); continue;
                    }
                    break;
                }

                while (rs.next()) {
                    String nutrientsName = rs.getString("NUTRIENTS_NAME");
                    String ingredientA = rs.getString("INGREDIENT_A");
                    String ingredientB = rs.getString("INGREDIENT_B");
                    String company = rs.getString("COMPANY");
                    String howToTake = rs.getString("HOW_TO_TAKE");

                    NutrientsVO vo = new NutrientsVO();
                    vo.setNutrientsName(nutrientsName);
                    vo.setIngredientA(ingredientA);
                    vo.setIngredientB(ingredientB);
                    vo.setCompany(company);
                    vo.setHowToTake(howToTake);

                    set.add(vo);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        Common.close(rs);
        Common.close(stmt);
        Common.close(conn);
        return set;
    }

    public List<BoardVO> searchBoard(){
        List<BoardVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();

            String query1 = "SELECT * FROM BOARD WHERE USER_ID = '" + Main.myId + "'";
            rs = stmt.executeQuery(query1);

            while (rs.next()) {
                String commentNo = rs.getString("COMMENT_NO");
                String nutrientsName = rs.getString("NUTRIENTS_NAME");
                String content = rs.getString("CONTENT");

                BoardVO vo = new BoardVO();
                vo.setCommentNo(commentNo);
                vo.setNutrientsName(nutrientsName);
                vo.setContent(content);

                list.add(vo);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Common.close(rs);
        Common.close(stmt);
        Common.close(conn);
        return list;
    }
    void printNutrients(TreeSet<NutrientsVO> set) {
        for (NutrientsVO e : set) {
            System.out.println("=".repeat(30));
            System.out.println("영양제 : " + e.getNutrientsName());
            if(e.getIngredientB() != null) System.out.println("성분 : " + e.getIngredientA() + ", " + e.getIngredientB());
            else System.out.println("성분 : " + e.getIngredientA());
            System.out.println("제조사 : " + e.getCompany());
        }
    }

    void printMyContent(List<BoardVO> list) {
        for (BoardVO e : list) {
            System.out.println("=".repeat(30));
            System.out.println(e.getCommentNo()+" / " + e.getNutrientsName() +" : " + e.getContent());
        }
    }
}
