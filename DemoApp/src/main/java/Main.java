import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int SCREEN_WIDTH = 1068;
    public static final int SCREEN_HEIGHT = 760;

    static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml"));
        stage = primaryStage;
        stage.setTitle("Gesture Library Demo Application");
        //primaryStage.getIcons(new Image("/DemoApp/images/icon.png"));
        stage.setResizable(false);
        stage.setScene(StartScreen.getScene());
        stage.show();
    }

    public static void setScene(Scene scene) {
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
