import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class StartScreenController {
//    public static Scene getScene() {
//        StackPane root = new StackPane();
//        Scene startScene = new Scene(root, SceneManager.SCREEN_WIDTH, SceneManager.SCREEN_HEIGHT);
//        startScene.getStylesheets().add("StartScreen.css");
//
//        ImageView back = new ImageView(new Image("images/startScreen.png", SceneManager.SCREEN_WIDTH, SceneManager.SCREEN_HEIGHT, false, true));
//
//        AnchorPane anchor = new AnchorPane();
//        Button start = new Button("Start");
//        start.setId("start");
//
//        start.setOnAction(event -> SceneManager.setScene(MenuScreen.getScene()));
//        start.setLayoutX(605.0);
//        start.setLayoutY(538.0);
//        anchor.getChildren().addAll(start);
//
//        root.getChildren().addAll(back, anchor);
//        return startScene;
//    }
    @FXML public void startButtonHandler(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().changeScene("menuScreen.fxml");
    }

}
