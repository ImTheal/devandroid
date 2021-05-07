package fr.sorbonne.l3.database;

public class Place {

    private String longitude;

    private String latitude;

    public Place(String longitude, String  latitude){
        this.longitude = longitude;
        this.latitude = latitude;
        System.out.println("ce qui vient d'être ajouté : latitude->" + this.getLatitude() + ", longitude->" + this.getLongitude());
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }
}
