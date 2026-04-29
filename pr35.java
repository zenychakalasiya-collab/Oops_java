import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;
public class Main extends Application {
    public void start(Stage stage) {
        int scale = 5;
        VBox projects = createBar("Projects — 20%", 20 * scale, Color.RED);
        VBox quizzes = createBar("Quizzes — 10%", 10 * scale, Color.BLUE);
        VBox midterm = createBar("Midterm — 30%", 30 * scale, Color.GREEN);
        VBox finalExam = createBar("Final — 40%", 40 * scale, Color.ORANGE);
        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().addAll(projects, quizzes, midterm, finalExam);
        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }
    VBox createBar(String text, int height, Color color) {
        Rectangle rect = new Rectangle(50, height);
        rect.setFill(color);
        Label label = new Label(text);
        VBox box = new VBox(5);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(rect, label);
        return box;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
