package fr.sorbonne.l3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import fr.sorbonne.l3.database.Place;

public class PlacesAdapter extends ArrayAdapter<Place> {

    public PlacesAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
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

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Place place = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.getTextViewLatitude().setText(place.getLatitude()+"");
        viewHolder.getTextViewLongitude().setText(place.getLongitude()+"");

        viewHolder.getButtonMaps().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?saddr=" + place.getLatitude() +"&daddr=" + place.getLongitude()));
                startActivity(intent);
            }
        });

        return convertView;
    }
}
