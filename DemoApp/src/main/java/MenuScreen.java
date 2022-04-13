import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class MenuScreen {
    public static Scene getScene() {
        StackPane root = new StackPane();
        Scene startScene = new Scene(root, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

        startScene.getStylesheets().add("MenuScreen.css");

        ImageView back = new ImageView(new Image("images/backdropCommon.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT, false, true));
        root.getChildren().add(back);

        Button canvas = new Button("Canvas");
        canvas.setOnAction(event -> Main.setScene(CanvasScreen.getScene()));
        Button aircraft = new Button("Aircraft Display");
        aircraft.setOnAction(event -> Main.setScene(AircraftDisplay.getScene()));

        AnchorPane main = new AnchorPane();
        canvas.setLayoutX(366);
        canvas.setLayoutY(297);

        aircraft.setLayoutX(366);
        aircraft.setLayoutY(454);

        main.getChildren().addAll(canvas, aircraft);

        root.getChildren().add(main);

        return startScene;
    }
}
