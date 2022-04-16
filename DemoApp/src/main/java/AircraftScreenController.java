import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class AircraftScreenController {

    static int index = 0;

    @FXML private ImageView image1;
    //@FXML private ImageView image2;

    @FXML public void backButtonHandler(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().changeScene("menuScreen.fxml");
    }

    @FXML public void clickActionHandler(ActionEvent event) throws IOException {
        if (index == 0) {
            index = 1;
            image1.setOpacity(0);
        } else {
            index = 0;
            image1.setOpacity(100);
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
