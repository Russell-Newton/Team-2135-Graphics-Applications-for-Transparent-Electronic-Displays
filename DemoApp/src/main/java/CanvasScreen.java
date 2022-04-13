import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class CanvasScreen {
    public static Scene getScene() {
        StackPane root = new StackPane();
        Scene canvasScreen = new Scene(root, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

        canvasScreen.getStylesheets().add("CanvasScreen.css");

        AnchorPane main = new AnchorPane();
        HBox topPanel = createTopPanel(main);

        Rectangle canvas = createCanvas();

        main.getChildren().addAll(topPanel, canvas);

        root.getChildren().add(main);

        return canvasScreen;
    }

    private static Rectangle createCanvas() {
        Rectangle canvas = new Rectangle();
        canvas.setLayoutX(28);
        canvas.setLayoutY(159);
        return canvas;
    }

    private static HBox createTopPanel(AnchorPane main) {
        HBox topPanel = new HBox(30);
        topPanel.setLayoutX(28);
        topPanel.setLayoutY(30);

        Button back = new Button("Back");
        back.setOnAction(event -> Main.setScene(MenuScreen.getScene()));
        Button help = new Button("How To");

        TextField console = new TextField();

        topPanel.getChildren().addAll(back, console, help);

        return topPanel;
    }
}
