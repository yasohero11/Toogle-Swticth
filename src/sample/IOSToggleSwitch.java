package sample;

import javafx.scene.paint.Color;

public class IOSToggleSwitch extends ToggleSwitch {

    public IOSToggleSwitch(double width , double height){
        super(width,height,height*0.49);
        setBackgroundFillTransitionColor(Color.LIGHTGRAY , Color.web("#4EE861"));
        setCircleColor(Color.WHITE);
    }

}
