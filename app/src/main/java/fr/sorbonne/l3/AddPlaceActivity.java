package fr.sorbonne.l3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fr.sorbonne.l3.database.Data;
import fr.sorbonne.l3.database.Place;

public class AddPlaceActivity extends AppCompatActivity {

    private Button addPlace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_place);
        initialise();
    }

    private void initialise() {
        addPlace = (Button) findViewById(R.id.addPlaceDB);
        addPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextLongitude = (EditText) findViewById(R.id.longitude);
                EditText editTextLatitude = (EditText) findViewById(R.id.latitude);
                String latitude = editTextLatitude.getText().toString();
                String longitude = editTextLongitude.getText().toString();
                editTextLatitude.setText("");
                editTextLongitude.setText("");
                Data.places.add(new Place(longitude, latitude));
                Toast.makeText(getApplicationContext(),"Le lieu a bien été ajouté !",Toast.LENGTH_SHORT).show();
            }
        });
    }
}