package com.singularitycoder.brhatmrdanga.home;

public class PlaceModel {

    String placeName;
    String booksSold;
    String lakshmiEarned;
    String dateVisited;

    public PlaceModel(String placeName, String booksSold, String lakshmiEarned, String dateVisited) {
        this.placeName = placeName;
        this.booksSold = booksSold;
        this.lakshmiEarned = lakshmiEarned;
        this.dateVisited = dateVisited;
    }

    public PlaceModel(String placeName, String dateVisited) {
        this.placeName = placeName;
        this.dateVisited = dateVisited;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getBooksSold() {
        return booksSold;
    }

    public void setBooksSold(String booksSold) {
        this.booksSold = booksSold;
    }

    public String getLakshmiEarned() {
        return lakshmiEarned;
    }

    public void setLakshmiEarned(String lakshmiEarned) {
        this.lakshmiEarned = lakshmiEarned;
    }

    public String getDateVisited() {
        return dateVisited;
    }

    public void setDateVisited(String dateVisited) {
        this.dateVisited = dateVisited;
    }
}
