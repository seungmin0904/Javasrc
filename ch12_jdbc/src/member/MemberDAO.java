package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    static {
        // 드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";

        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {

        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DML + SELECT
    // insert, delete , update : int 리턴
    // select : ~~ DTO(where절에 pk지정) , or List<~~DTO>(pk 지정 외에는 List)

    // insert,update : 전달인자 ~~DTO
    public int insert(MemberDTO memberDTO) {

        int result = 0;
        try {
            con = getConnection();
            String sql = "INSERT INTO member(id,name,addr,email,age) ";
            sql += "values(?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            // 물음표
            pstmt.setString(1, memberDTO.getId());
            pstmt.setString(2, memberDTO.getName());
            pstmt.setString(3, memberDTO.getAddr());
            pstmt.setString(4, memberDTO.getEmail());
            pstmt.setInt(5, memberDTO.getAge());

            result = pstmt.executeUpdate();
        } catch (Exception e) {

        } finally {
            close(con, pstmt);
        }
        return result;
    }

    // update
    public int update(MemberDTO memberDTO) {
        // memberDTO
        // 1.
        // 2.
        int result = 0;
        try {
            con = getConnection();
            String sql = "update member ";
            if (memberDTO.getAddr() != null) {
                sql += "set addr = ? ";
                sql += "where id =?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getAddr());
                pstmt.setString(2, memberDTO.getId());
            } else {
                sql += "set email = ? ";
                sql += "where id =?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getEmail());
                pstmt.setString(2, memberDTO.getId());

            }

            result = pstmt.executeUpdate();

        } catch (Exception e) {

        } finally {
            close(con, pstmt);
        }
        return result;
    }
}
