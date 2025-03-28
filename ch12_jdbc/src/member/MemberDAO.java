package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import emp.EmpDTO;

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

    // select * from member where name like '%홍%'
    public List<MemberDTO> getNameList(String name) {
        List<MemberDTO> list = new ArrayList<>();
        try {
            con = getConnection();
            String sql = " SELECT * FROM member where name like ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();

            // rs > dto 옮기기
            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                // 객체변수에 rs 꺼내기 get , dto에 담기 set
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list.add(memberDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    // 전체조회 list ~ DTO
    public List<MemberDTO> getList() {

        List<MemberDTO> list = new ArrayList<>();
        try {
            con = getConnection();
            String sql = " SELECT * FROM member ";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // rs > dto 옮기기
            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                // 객체변수에 rs 꺼내기 get , dto에 담기 set
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));

                // list에 dto에 담은 set값 넣기
                list.add(memberDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    // insert,update : 전달인자 ~~DTO
    public int insert(MemberDTO memberDTO) {

        int result = 0;
        try {
            con = getConnection();
            String sql = "INSERT INTO member(no,id,name,addr,email,age) ";
            sql += "values(member_seq.nextval,?,?,?,?,?)";
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

    // delete : 전달인자 - pk 사용함
    public int delete(String id) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "delete from member where id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
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

    public MemberDTO getRow(String id) {
        MemberDTO memberDTO = null;
        try {
            con = getConnection();
            String sql = " SELECT * FROM member where id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();

            // rs > dto 옮기기
            if (rs.next()) {
                memberDTO = new MemberDTO();
                // 객체변수에 rs 꺼내기 get , dto에 담기 set
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return memberDTO;
    }
}
