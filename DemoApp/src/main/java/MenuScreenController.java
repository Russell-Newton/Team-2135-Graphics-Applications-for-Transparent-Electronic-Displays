import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuScreenController {
    @FXML public void canvasButtonHandler(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().changeScene("canvasScreen.fxml");

    }

    @FXML public void aircraftButtonHandler(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().changeScene("aircraftScreen.fxml");
    }
//    public static Scene getScene() {
//        StackPane root = new StackPane();
//        Scene startScene = new Scene(root, SceneManager.SCREEN_WIDTH, SceneManager.SCREEN_HEIGHT);
//
//        startScene.getStylesheets().add("MenuScreen.css");
//
//        ImageView back = new ImageView(new Image("images/backdropCommon.png", SceneManager.SCREEN_WIDTH, SceneManager.SCREEN_HEIGHT, false, true));
//        root.getChildren().add(back);
//
//        Button canvas = new Button("Canvas");
//        canvas.setOnAction(event -> SceneManager.setScene(CanvasScreen.getScene()));
//        Button aircraft = new Button("Aircraft Display");
//        aircraft.setOnAction(event -> SceneManager.setScene(AircraftDisplay.getScene()));
//
//        AnchorPane main = new AnchorPane();
//        canvas.setLayoutX(366);
//        canvas.setLayoutY(297);
//
//        aircraft.setLayoutX(366);
//        aircraft.setLayoutY(454);
//
//        main.getChildren().addAll(canvas, aircraft);
//
//        root.getChildren().add(main);
//
//        return startScene;
//    }
}
