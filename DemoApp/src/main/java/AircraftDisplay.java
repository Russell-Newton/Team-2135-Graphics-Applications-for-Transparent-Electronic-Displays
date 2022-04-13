import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class AircraftDisplay {
    public static Scene getScene() {
        StackPane root = new StackPane();
        Scene aircraft = new Scene(root, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

        return aircraft;
    }
}
