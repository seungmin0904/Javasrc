import java.sql.*;

public class OracleDBExample {
    public static void main(String[] args) {
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Registration Success");

            
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
            String user = "system";  
            String password = "lee695563!";  

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("DB Connection Success");

           
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT table_name FROM user_tables");

            System.out.println("ResultSet retrieved:");
            while (rs.next()) {
                System.out.println("Table: " + rs.getString("table_name"));
            }
            
            
            
            
            
            
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Registration Failure");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB Connection Failure");
            e.printStackTrace();
        }
    }
}
