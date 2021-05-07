package fr.sorbonne.l3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button addPlace;
    private Button showPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialise();
    }

    private void initialise() {
        addPlace = findViewById(R.id.addPlace);
        showPlaces = findViewById(R.id.showPlaces);

        addPlace.setOnClickListener(v -> {
            Intent myIntent = new Intent(v.getContext(), AddPlaceActivity.class);
            startActivityForResult(myIntent, 0);
        });

        showPlaces.setOnClickListener(v -> {
            Intent myIntent = new Intent(v.getContext(), ShowPlacesActivity.class);
            startActivityForResult(myIntent, 0);
        });
    }
}