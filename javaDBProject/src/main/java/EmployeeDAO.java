import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system";
    private static final String PASSWORD = "lee695563!";

    // DB 연결
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // 직원 추가
    public void addEmployee(int id, String name, int salary) {
        String sql = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, salary);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " 직원이 추가되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 직원 삭제
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("직원 삭제 완료!");
            } else {
                System.out.println("해당 ID를 가진 직원이 없습니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 직원 목록 조회
    public void getEmployees() {
        String sql = "SELECT * FROM employees";

        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                System.out.println("ID: " + id + ", 이름: " + name + ", 급여: " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 직원 정보 수정
    public void updateSalary(int id, int newSalary) {
        String sql = "UPDATE employees SET salary = ? WHERE id = ?";

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, newSalary);
            pstmt.setInt(2, id);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " 직원의 급여가 수정되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
