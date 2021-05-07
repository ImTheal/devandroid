package fr.sorbonne.l3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fr.sorbonne.l3.database.Place;

import static androidx.core.app.ActivityCompat.startActivityForResult;
import static androidx.core.content.ContextCompat.startActivity;

public class PlacesAdapter extends ArrayAdapter<Place> {

    private Context context;

    public PlacesAdapter(Context context, List<Place> places) {
        super(context, 0, places);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.place_item, parent, false);
        }

        PlaceItemHolder viewHolder = (PlaceItemHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new PlaceItemHolder();
            viewHolder.setTextViewLatitude((TextView) convertView.findViewById(R.id.latitude));
            viewHolder.setTextViewLongitude((TextView) convertView.findViewById(R.id.longitude));
            viewHolder.setButtonMaps((Button) convertView.findViewById(R.id.maps_button));
            convertView.setTag(viewHolder);
        }

        Place place = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        System.out.println("geo1:" + place.getLatitude() + "," + place.getLongitude());
        viewHolder.getTextViewLatitude().setText(place.getLatitude());
        viewHolder.getTextViewLongitude().setText(place.getLongitude());

        viewHolder.getButtonMaps().setOnClickListener(v -> {
            // Creates an Intent that will load a map of San Francisco
            Uri gmmIntentUri = Uri.parse("geo:" + place.getLongitude() + "," + place.getLatitude());
            System.out.println("geo:" + place.getLatitude() + "," + place.getLongitude());
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            context.startActivity(mapIntent);
        });

        return convertView;
    }
}
