/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphStructure;


/**
 *
 * @author
 */
public class Place {

    String name;
    String PlaceID;
    String exactAddress;
    double latitude;
    double longitude;
    String typePlace;

    public Place(String name, String PlaceID, String exactAddress, double latitude, double longitude, String typePlace) {
        this.name = name;
        this.PlaceID = PlaceID;
        this.exactAddress = exactAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.typePlace = typePlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceID() {
        return PlaceID;
    }

    public void setPlaceID(String PlaceID) {
        this.PlaceID = PlaceID;
    }

    public String getExactAddress() {
        return exactAddress;
    }

    public void setExactAddress(String exactAddress) {
        this.exactAddress = exactAddress;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTypePlace() {
        return typePlace;
    }

    public void setTypePlace(String typePlace) {
        this.typePlace = typePlace;
    }

    @Override
    public String toString() {
        return "Place{" + "PlaceID=" + PlaceID + ", exactAddress=" + exactAddress + ", latitude=" + latitude + ", longitude=" + longitude +  ", typePlace=" + typePlace + '}';
    }

}
