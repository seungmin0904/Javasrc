package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            con = DriverManager.getConnection(url, user, password);

            String sql = "update dept_temp set loc='seoul' WHERE deptno=10";
            pstmt = con.prepareStatement(sql);
            System.out.println(pstmt.executeUpdate() > 0 ? "수정성공" : "수정실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
