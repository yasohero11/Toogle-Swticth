package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Toggle Switch");

         ToggleSwitch toggleSwitch =new IOSToggleSwitch(50,30);
         Text text = new Text("OFF");
         text.setFill(Color.WHITE);
         FlowPane flowPane =new FlowPane(text , toggleSwitch);
         flowPane.setHgap(20);


        ToggleSwitch googleToggleSwitch =new GoogleToggleSwitch(30,15);
        Text text2 = new Text("OFF");
        text2.setFill(Color.WHITE);
        FlowPane flowPane2 =new FlowPane(text2 , googleToggleSwitch);
        flowPane2.setHgap(20);




        toggleSwitch.switchedOnProperty().addListener(e->{
            if(toggleSwitch.isSwitchedOn())
                text.setText("ON");
            else
                text.setText("OFF");

        });
        googleToggleSwitch.switchedOnProperty().addListener(e->{
            if(googleToggleSwitch.isSwitchedOn())
                text2.setText("ON");
            else
                text2.setText("OFF");
        });



        VBox layout = new VBox(flowPane , flowPane2);
        layout.setPadding(new Insets(50,50,50,50));
        layout.setSpacing(50);
         layout.setStyle("-fx-background-color: black");

        primaryStage.setScene(new Scene(layout, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
