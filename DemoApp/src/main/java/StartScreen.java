import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class StartScreen {
    public static Scene getScene() {
        StackPane root = new StackPane();
        Scene startScene = new Scene(root, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        startScene.getStylesheets().add("StartScreen.css");

        ImageView back = new ImageView(new Image("images/startScreen.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT, false, true));

        AnchorPane anchor = new AnchorPane();
        Button start = new Button("Start");
        start.setId("start");

        start.setOnAction(event -> Main.setScene(MenuScreen.getScene()));
        start.setLayoutX(605.0);
        start.setLayoutY(538.0);
        anchor.getChildren().addAll(start);

        root.getChildren().addAll(back, anchor);
        return startScene;
    }
}
