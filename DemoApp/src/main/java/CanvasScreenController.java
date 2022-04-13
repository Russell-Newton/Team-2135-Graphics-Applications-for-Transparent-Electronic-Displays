import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class CanvasScreenController {
    @FXML public void backButtonHandler(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().changeScene("menuScreen.fxml");
    }

    @FXML public void helpButtonHandler(ActionEvent actionEvent) {
    }
//    public static Scene getScene() {
//        StackPane root = new StackPane();
//        Scene canvasScreen = new Scene(root, SceneManager.SCREEN_WIDTH, SceneManager.SCREEN_HEIGHT);
//
//        canvasScreen.getStylesheets().add("CanvasScreen.css");
//
//        AnchorPane main = new AnchorPane();
//        HBox topPanel = createTopPanel(main);
//
//        Rectangle canvas = createCanvas();
//
//        main.getChildren().addAll(topPanel, canvas);
//
//        root.getChildren().add(main);
//
//        return canvasScreen;
//    }
//
//    private static Rectangle createCanvas() {
//        Rectangle canvas = new Rectangle();
//        canvas.setLayoutX(28);
//        canvas.setLayoutY(159);
//        return canvas;
//    }
//
//    private static HBox createTopPanel(AnchorPane main) {
//        HBox topPanel = new HBox(30);
//        topPanel.setLayoutX(28);
//        topPanel.setLayoutY(30);
//
//        Button back = new Button("Back");
//        back.setOnAction(event -> SceneManager.setScene(MenuScreenController.getScene()));
//        Button help = new Button("How To");
//
//        TextField console = new TextField();
//
//        topPanel.getChildren().addAll(back, console, help);
//
//        return topPanel;
//    }
}
