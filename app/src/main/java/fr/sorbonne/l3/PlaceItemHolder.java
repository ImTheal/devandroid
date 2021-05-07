package fr.sorbonne.l3;

import android.widget.Button;
import android.widget.TextView;

public class PlaceItemHolder {
    private TextView textViewLongitude;
    private TextView textViewLatitude;
    private Button buttonMaps;

    public void setTextViewLongitude(TextView textViewLongitude) {
        this.textViewLongitude = textViewLongitude;
    }

    public void setTextViewLatitude(TextView textViewLatitude) {
        this.textViewLatitude = textViewLatitude;
    }

    public void setButtonMaps(Button buttonMaps) {
        this.buttonMaps = buttonMaps;
    }

    public TextView getTextViewLongitude() {
        return textViewLongitude;
    }

    public TextView getTextViewLatitude() {
        return textViewLatitude;
    }

    public Button getButtonMaps() {
        return buttonMaps;
    }
}
