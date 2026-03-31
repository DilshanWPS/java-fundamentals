package ui;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import model.User;
import service.UserService;

public class RegisterUserController {

    @FXML
    private ComboBox<String> roleBox;

    @FXML
    private ComboBox<String> titleBox;

    @FXML
    private TextField regNoField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    // Runs automatically when UI loads
    @FXML
    public void initialize() {
        roleBox.getItems().addAll("principal", "teacher", "student");
        titleBox.getItems().addAll("Mr", "Mrs", "Ms");
    }

    @FXML
    private void handleRegister() {

        String role = roleBox.getValue();
        String regNo = regNoField.getText();
        String title = titleBox.getValue();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();

        // Basic validation
        if(role == null || title == null || regNo.isEmpty() || firstName.isEmpty() || lastName.isEmpty()){
            System.out.println("Please fill all fields!");
            return;
        }

        // Create user object
        User user = new User(role, regNo, title, firstName, lastName);

        // Save to database
        UserService.saveUser(user);

        System.out.println("User registered successfully!");

        // Clear fields
        regNoField.clear();
        firstNameField.clear();
        lastNameField.clear();
        roleBox.setValue(null);
        titleBox.setValue(null);
    }
}