import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;
public class Main extends Application {
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        Label rollLabel = new Label("Roll No:");
        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");
        Label emailLabel = new Label("Email:");
        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();
        Button submitBtn = new Button("Submit");
        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);
        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);
        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(submitBtn, 1, 4);
        submitBtn.setOnAction(e -> {
            String roll = rollField.getText();
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();
            try {
                int r = Integer.parseInt(roll);
                int a = Integer.parseInt(age);
                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Email must contain @ and .");
                }
                FileChooser fc = new FileChooser();
                File file = fc.showSaveDialog(stage);
                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    bw.write(r + " " + name + " " + a + " " + email);
                    bw.newLine();
                    bw.close();
                }
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setContentText("Registration Successful\nRollNo: " + r +
                        "\nName: " + name + "\nAge: " + a + "\nEmail: " + email);
                success.showAndWait();
            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setContentText("Roll No and Age must be numbers");
                error.showAndWait();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        })
        Scene scene = new Scene(grid, 300, 200);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
