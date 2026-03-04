import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserService {

    public static void saveUser(String role, String title, String firstName, String lastName) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn == null) {
            System.out.println("Cannot save user. No database connection.");
            return;
        }

        String sql = "INSERT INTO users (role, title, first_name, last_name) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, role);
            stmt.setString(2, title);
            stmt.setString(3, firstName);
            stmt.setString(4, lastName);

            int rows = stmt.executeUpdate();
            if(rows > 0) {
                System.out.println("User saved successfully!");
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error saving user:");
            e.printStackTrace();
        }
    }
}