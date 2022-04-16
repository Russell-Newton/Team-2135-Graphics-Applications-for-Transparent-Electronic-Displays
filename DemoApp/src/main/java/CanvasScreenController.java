import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.io.IOException;

public class CanvasScreenController {

    @FXML private Button help;
    @FXML private Button back;
    @FXML private TextArea textField;
    @FXML private Rectangle canvas;
    @FXML private HBox topBar;

    @FXML private AnchorPane backPane;

    private AnchorPane helpScreen = new AnchorPane();

    @FXML private ImageView exit;

    @FXML public void backButtonHandler(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().changeScene("menuScreen.fxml");
    }

    @FXML public void helpButtonHandler(ActionEvent actionEvent) throws IOException {
        System.out.println("handling help button");
        help.setDisable(true);
        back.setDisable(true);
        textField.setDisable(true);
        topBar.setOpacity(30.0);
        canvas.setOpacity(30.0);
        //this wont change the stroke of the rectangle
        //we can add the help text on top of the rectangle and add an exit in the corner

//        if (!backPane.getChildren().contains(helpScreen)) {
//            setUpHelpText();
//        } else
//            helpScreen.setOpacity(100.0);

        setUpHelpText();
        backPane.getChildren().add(helpScreen);
    }

    public void setUpHelpText() {
        exit = new ImageView(new Image("images/icon.png"));
        exit.setLayoutX(back.getLayoutX());
        exit.setLayoutY(back.getLayoutY());
        exit.setOnMouseReleased(this::handleExitButton);

        VBox text = new VBox(10);
        text.setId("text");
        text.setAlignment(Pos.CENTER);
        text.maxWidth(canvas.getWidth());
        text.setLayoutX(SceneManager.SCREEN_WIDTH/8.0);
        text.setLayoutY(canvas.getLayoutY() + canvas.getHeight()/4);

        double width = SceneManager.SCREEN_WIDTH * (6.0/8.0);

        Label line1 = new Label("Perform any of the available gestures on this blank canvas.");
        line1.setId("line1");
        line1.setPrefWidth(width);
        Label line2 = new Label("Information about the gesture (start and end position, duration, etc.) will display at the top of the screen.");
        line2.setId("line2");
        line2.setPrefWidth(width);
        Label line3 = new Label("Press 'C' to clear the canvas and the output.");
        line3.setId("line3");
        line3.setPrefWidth(width);
        line3.setAlignment(Pos.CENTER); //idk why we need this but it doesnt work without it soooooooo ¯\_(ツ)_/¯

        text.getChildren().addAll(line1, line2, line3);

        helpScreen.getChildren().addAll(exit, text);
    }

    public void handleExitButton(MouseEvent event) {
        help.setDisable(false);
        back.setDisable(false);
        textField.setDisable(false);
        topBar.setOpacity(100.0);
        canvas.setOpacity(100.0);
        backPane.getChildren().remove(helpScreen);
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
