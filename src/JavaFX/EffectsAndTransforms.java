package JavaFX;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.TilePane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class EffectsAndTransforms extends Application{
    private double angle = 0.0, scaleFactor = 1.0, blurVal = 1.0, glowVal=1;

    private Reflection reflection = new Reflection();

    private BoxBlur blur = new BoxBlur(1.0, 1.0, 2);
    private Rotate rotate = new Rotate();
    private Glow glow = new Glow();
    private Scale scale = new Scale(scaleFactor, scaleFactor);

    private CheckBox obRotation, obBlur, obScale, obGlow;

    private Label response, responseGlow, responseScale, responseBlur, selected;

    private Button btnRotate = new Button ("Rotate");
    private Button btnBlur = new Button ("Blur off");
    private Button btnScale = new Button ("Scale");
    private Button btnGlow = new Button ("Glow");

    private Label reflect = new Label("Reflection Adds Visual Sparkle");

    public void start (Stage myStage){
        myStage.setTitle("Effects and transfors");

        TilePane rootNode = new TilePane(50, 50);

        rootNode.setOrientation(Orientation.VERTICAL);

        Scene myScene = new Scene (rootNode, 600, 350);

        myStage.setScene(myScene);

        btnRotate.getTransforms().addAll(rotate, scale);
        btnScale.getTransforms().addAll(rotate, scale);
        btnBlur.getTransforms().addAll(rotate, scale);
        btnGlow.getTransforms().addAll(rotate, scale);

        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.7);
        reflect.setEffect(reflection);

        response = new Label("Rotation switch off");
        responseGlow = new Label("Glow switch off");
        responseScale = new Label("Scale switch off");
        responseBlur = new Label("Blur switch off");

        selected = new Label("");

        obRotation = new CheckBox("Rotation");
        obBlur = new CheckBox("Blur");
        obScale = new CheckBox("Scale");
        obGlow = new CheckBox("Glow");


        obRotation.setOnAction(ae -> {
            if(obRotation.isSelected()){response.setText("Rotation switch on");}else{response.setText("Rotation switch off");}
            btnRotate.setOnAction(ae1 -> {
                if(obRotation.isSelected()){
                    response.setText("Rotation switch on");
                    angle += 45.0;
                    rotate.setAngle(angle);
                    rotate.setPivotX(btnRotate.getWidth()/2);
                    rotate.setPivotY(btnRotate.getHeight()/2);
                }
                else{response.setText("");}
            });
        });

        obGlow.setOnAction(ae -> {
            if(obGlow.isSelected()){responseGlow.setText("Glow switch on");}else{responseGlow.setText("Glow switch off");}
            btnGlow.setOnAction(ae12 -> {
                if(obGlow.isSelected()){
                    if(glowVal == 2.0){
                        glowVal = 1.0;
                        btnGlow.setEffect(null);
                        btnScale.setEffect(null);
                        btnRotate.setEffect(null);
                        btnBlur.setEffect(null);
                        btnGlow.setText("Glow off");
                    }
                    else{
                        glowVal++;
                        btnGlow.setEffect(glow);
                        btnRotate.setEffect(glow);
                        btnScale.setEffect(glow);
                        btnBlur.setEffect(glow);
                        btnGlow.setText("glow on");
                    }
                }
                else{responseGlow.setText("");}
            });
        });

        obScale.setOnAction(ae -> {
            if(obScale.isSelected()){responseScale.setText("Scale switch on");}else{responseScale.setText("Scale switch off");}
            btnScale.setOnAction(ae13 -> {
                if(obScale.isSelected()){
                    scaleFactor+=0.1;
                    if(scaleFactor>1.5) scaleFactor=0.5;
                    scale.setX(scaleFactor);
                    scale.setY(scaleFactor);
                }
                else{responseScale.setText("");}
            });
        });

        obBlur.setOnAction(ae -> {
            if(obBlur.isSelected()){responseBlur.setText("Blur switch on");}else{responseBlur.setText("Blur switch off");}
            btnBlur.setOnAction(ae14 -> {
                if(obBlur.isSelected()){
                    if(blurVal == 2.0){
                        blurVal = 1.0;
                        btnBlur.setEffect(null);
                        btnGlow.setEffect(null);
                        btnScale.setEffect(null);
                        btnRotate.setEffect(null);
                        btnBlur.setText("Blur off");
                    }
                    else{
                        blurVal++;
                        btnBlur.setEffect(blur);
                        btnGlow.setEffect(blur);
                        btnRotate.setEffect(blur);
                        btnScale.setEffect(blur);
                        btnBlur.setText("Blur on");
                    }
                    blur.setWidth(blurVal);
                    blur.setHeight(blurVal);
                }
                else{responseBlur.setText("");}
            });
        });

        rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, btnGlow, reflect,  response, responseScale, responseBlur, responseGlow, selected, obRotation, obScale, obBlur, obGlow);
        myStage.show();
    }

    public static void main (String [] args){
        launch (args);
    }
}
				