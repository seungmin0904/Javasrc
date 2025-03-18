
import java.io.IOException;
    import java.sql.*;
    import javax.servlet.*;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.*;
    import java.io.PrintWriter;
    
    @WebServlet("/employees")
    public class EmployeeServlet extends HttpServlet {
    
        private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
        private static final String USER = "system";
        private static final String PASSWORD = "lee695563!";
    
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {
    
                out.println("<h1>직원 목록</h1>");
                out.println("<table border='1'>");
                out.println("<tr><th>ID</th><th>이름</th><th>급여</th></tr>");
    
                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getInt("id") + "</td>");
                    out.println("<td>" + rs.getString("name") + "</td>");
                    out.println("<td>" + rs.getInt("salary") + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                
            } catch (SQLException e) {
                e.printStackTrace();
                out.println("데이터베이스 오류 발생");
            }
        }

}
