package JavaFX.min_max_window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * program open window
 * button ESC minimize window
 * button f maximize window
 */
public class FullScreen extends Application {

    public void start(Stage stage) {

        stage.addEventFilter(MouseEvent.MOUSE_PRESSED, event -> {
            if (stage.isFullScreen() && event.isShortcutDown() && event.isPrimaryButtonDown()) {
                stage.setFullScreen(false);
                event.consume();
            }
        });

        stage.addEventFilter(KeyEvent.KEY_TYPED, event -> {
            if (!stage.isFullScreen()) {
                if (event.getCharacter().equals("f")){
                    stage.setFullScreen(true);
                event.consume();
            }
            }
        });

        stage.setScene(new Scene(new StackPane()));
        stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}