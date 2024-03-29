package 데이터베이스;

import java.util.List;
import java.util.Scanner;

public class JdbcMain {

    public static void main(String[] args) {
        menuSelect();
    }

    public static void menuSelect() {
        String title = "영양제 추천 사이트";
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println(title);
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.println("[1]SELECT, [2]회원가입, [3]UPDATE, [4]DELETE, [5]EXIT");
            int sel = sc.nextInt();
            switch(sel) {
                case 1:
                    EmpSelectDAO select = new EmpSelectDAO();
                    List<EmpVO> list = select.listEmp();
                    select.printEmpSelect(list);
                    break;
                case 2 :
                    MemberInsertDAO insert = new MemberInsertDAO();
                    insert.memberInsert();
                    break;
                case 3 :
                    EmpUpdateDAO update = new EmpUpdateDAO();
                    update.empUpdate();
                    break;
                case 4 :
                    EmpDeleteDAO delete = new EmpDeleteDAO();
                    delete.empDelete();
                    break;
                case 5 :
                    System.out.println("메뉴를 종료 합니다");
                    return;
            }
        }
    }
}
