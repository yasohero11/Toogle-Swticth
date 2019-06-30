package sample;

import javafx.scene.paint.Color;

public class GoogleToggleSwitch extends ToggleSwitch {
    GoogleToggleSwitch(double width , double height){
        super(width,height,height-5);
        setBackgroundFillTransitionColor(Color.LIGHTGRAY ,Color.web("#558BDF"));
        setCircleColor(Color.RED);
        setCircleFillTransitionColor(Color.WHITE,Color.web("#0E4DEB") );

        setMove(height);
    }
}
