package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DatabaseConnection;
import model.User;

public class UserService {

    public static void saveUser(User user) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn == null) {
            System.out.println("Cannot save user. No database connection.");
            return;
        }

        String sql = "INSERT INTO user (role, registration_number, title, first_name, last_name) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, user.getRole());
            stmt.setString(2, user.getRegistrationNumber());
            stmt.setString(3, user.getTitle());
            stmt.setString(4, user.getFirstName());
            stmt.setString(5, user.getLastName());

            int rows = stmt.executeUpdate();

            if (rows > 0) {
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