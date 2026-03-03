import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/school_db";
    private static final String USER = "root";  
    private static final String PASSWORD = "2002"; 

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Error connecting to database:");
            e.printStackTrace();
            return null;
        }
    }
}