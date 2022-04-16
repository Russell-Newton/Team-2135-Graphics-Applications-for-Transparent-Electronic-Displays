import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class AircraftScreenController {

    static int index = 0;

    @FXML private ImageView radar;
    //@FXML private ImageView image2;

    @FXML public void backButtonHandler(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().changeScene("menuScreen.fxml");
    }

    @FXML public void clickActionHandler(MouseEvent event) throws IOException {
        if (index == 0) {
            index = 1;
            radar.setFitWidth(radar.getFitWidth() * 2);
            radar.setFitHeight(radar.getFitHeight() * 2);
        } else {
            index = 0;
            radar.setFitWidth(radar.getFitWidth() / 2);
            radar.setFitHeight(radar.getFitHeight() / 2);
        }
        System.out.println(index);
    }
//    public static Scene getScene() {
//        StackPane root = new StackPane();
//        Scene aircraft = new Scene(root, SceneManager.SCREEN_WIDTH, SceneManager.SCREEN_HEIGHT);
//
//        return aircraft;
//    }
}
