package 데이터베이스;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpSelectDAO {
    public List<EmpVO> listEmp() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<EmpVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM EMP";
            rs = stmt.executeQuery(query);

            while(rs.next()) {
                int empNO = rs.getInt("EMPNO");
                String name = rs.getString("ENAME");
                String job = rs.getString("JOB");
                int mgr = rs.getInt("MGR");
                Date hireDate = rs.getDate("HIREDATE");
                int sal = rs.getInt("SAL");
                int comm = rs.getInt("COMM");
                int deptNo = rs.getInt("DEPTNO");

                EmpVO vo = new EmpVO();
                vo.setEmpNO(empNO);
                vo.setName(name);
                vo.setJob(job);
                vo.setMgr(mgr);
                vo.setDate(hireDate);
                vo.setSal(sal);
                vo.setComm(comm);
                vo.setDeptNO(deptNo);

                list.add(vo);
            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    void printEmpSelect(List<EmpVO> list) {
        for(EmpVO e : list) {
            System.out.print(e.getEmpNO() + " ");
            System.out.print(e.getName() + " ");
            System.out.print(e.getJob() + " ");
            System.out.print(e.getMgr() + " ");
            System.out.print(e.getDate() + " ");
            System.out.print(e.getSal() + " ");
            System.out.print(e.getComm() + " ");
            System.out.print(e.getDeptNO() + " ");
            System.out.println();
        }
    }
}