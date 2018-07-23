package JavaFX.media_player;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class EmbeddedMediaPlayer extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Media Player");
        Group root = new Group();
        Scene scene = new Scene(root, 540, 241);

        stage.setScene(scene);

        // create media player
        Media media = new Media("FILE///D:/Video/Films/Возмещение_ущерба.mpeg4");
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        MediaControl mediaControl = new MediaControl(mediaPlayer);
        scene.setRoot(mediaControl);

        stage.show();
    }
}