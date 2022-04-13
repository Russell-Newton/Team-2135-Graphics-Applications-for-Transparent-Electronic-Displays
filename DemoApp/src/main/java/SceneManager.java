import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneManager extends Application {

    private static SceneManager instance;

    public SceneManager() {
        if (instance == null) {
            instance = this;
        }
    }

    public static SceneManager getInstance() {
        return instance;
    }

    public void changeScene(String fxmlFile) throws IOException {
        scene.setRoot(loadScene(fxmlFile));
    }

    private Parent loadScene(String fxmlFile) throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlFile)));
    }

    public static final int SCREEN_WIDTH = 1068;
    public static final int SCREEN_HEIGHT = 760;

    private Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Gesture Library Demo Application");
        primaryStage.setResizable(false);

        scene = new Scene(loadScene("startScreen.fxml"), SCREEN_WIDTH, SCREEN_HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
