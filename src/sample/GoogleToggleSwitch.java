package sample;

import javafx.scene.paint.Color;
import javafx.util.Duration;

public class GoogleToggleSwitch extends ToggleSwitch {
    GoogleToggleSwitch(double width , double height){
        super(width,height,height*0.70);
        setBackgroundFillTransitionColor(Color.web("#B3B6B7") ,Color.web("#558BDF"));
        setCircleFillTransitionColor(Color.WHITE,Color.web("#0E4DEB") );
        setDuration(Duration.seconds(0.15));
        googleMode();
    }
}
