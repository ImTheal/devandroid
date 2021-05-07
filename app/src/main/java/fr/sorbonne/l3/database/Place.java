package fr.sorbonne.l3.database;

public class Place {

    private String longitude;

    private String latitude;

    public Place(String longitude, String  latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }
}
