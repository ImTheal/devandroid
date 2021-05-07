package fr.sorbonne.l3.database;

public class Place {

    private float longitude;

    private float latitude;

    public Place(float longitude, float  latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }
}
