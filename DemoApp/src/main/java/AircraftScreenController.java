import javafx.event.ActionEvent;

import java.io.IOException;

public class AircraftScreenController {
    public void backButtonHandler(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().changeScene("menuScreen.fxml");
    }
//    public static Scene getScene() {
//        StackPane root = new StackPane();
//        Scene aircraft = new Scene(root, SceneManager.SCREEN_WIDTH, SceneManager.SCREEN_HEIGHT);
//
//        return aircraft;
//    }
}
