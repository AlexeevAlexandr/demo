import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFX extends Application {
    private Label myLabel;
    public static void main(String[] args) {
        launch(args);
    }
    public void init (){
    }
    public void start (Stage myStage){
        myStage.setTitle("JavaFX");
        Label myLabel2 = new Label("Select button");
        myLabel = new Label("Not confirmed");//her can will set default text
        //adding buttons
        ObservableList<String> list = FXCollections.observableArrayList("Train", "Car", "Airplane", "Bicycle");
        ListView<String> lw = new ListView<>(list);
        lw.setPrefSize(180,60);
        MultipleSelectionModel<String> multi = lw.getSelectionModel();
        CheckBox checkBox = new CheckBox("AA");
        CheckBox checkBox2 = new CheckBox("BB");
        Button confirm = new Button("Confirm selection");
        RadioButton a = new RadioButton("A");
        RadioButton b = new RadioButton("B");
        //create group
        ToggleGroup tg = new ToggleGroup();
        //set button in group
        a.setToggleGroup(tg);
        b.setToggleGroup(tg);
        //event handling all buttons
        tg.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
           RadioButton b1 = (RadioButton) newValue;
           myLabel.setText("Selected "+ b1.getText());
        });
        //set button switch on as default
        b.setSelected(true);

        multi.selectedItemProperty().addListener((observable, oldValue, newValue) -> myLabel.setText("Selected is "+newValue));
        confirm.setOnAction(event -> {
            RadioButton rb = (RadioButton) tg.getSelectedToggle();
            myLabel.setText(rb.getText()+" is Confirmed");
        });
        //event handling
        checkBox.setOnAction(event -> myLabel.setText("Selected "+checkBox.getText()));
        checkBox2.setOnAction(event -> myLabel.setText("Selected "+checkBox2.getText()));

        FlowPane rootNode = new FlowPane(10,10);//values set space between the buttons
        Scene myScene = new Scene(rootNode, 200, 300);
        myStage.setScene(myScene);
        //set position for buttons
        rootNode.setAlignment(Pos.CENTER);
        Separator separator = new Separator();
        Separator separator2 = new Separator();
        Separator separator3 = new Separator();
        Separator separator4 = new Separator();
        Separator separator5 = new Separator();
        separator.setPrefWidth(180);
        separator2.setPrefWidth(180);
        separator3.setPrefWidth(180);
        separator4.setPrefWidth(180);
        separator5.setPrefWidth(180);
        //add on scene
        rootNode.getChildren().addAll(lw, separator4, checkBox, checkBox2, separator3, myLabel2, separator2, a, b, separator, confirm, separator5, myLabel);

        myStage.show();
    }
    public void stop () {
    }
}
