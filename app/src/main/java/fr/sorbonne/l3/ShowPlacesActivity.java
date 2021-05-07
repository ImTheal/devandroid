package fr.sorbonne.l3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import fr.sorbonne.l3.database.Data;
import fr.sorbonne.l3.database.Place;

public class ShowPlacesActivity extends AppCompatActivity {

    private ListView listPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_places);
        initialise();
    }

    private void initialise() {
        listPlaces = (ListView) findViewById(R.id.placesList);
        PlacesAdapter placesAdapter = new PlacesAdapter(ShowPlacesActivity.this, Data.places);
        listPlaces.setAdapter(placesAdapter);
    }
}