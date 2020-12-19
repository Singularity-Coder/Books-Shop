package com.singularitycoder.brhatmrdanga.home.model;

public class PlaceModel {

    String placeName;
    String booksSold;
    String moneyEarned;
    String dateVisited;

    public PlaceModel(String placeName, String booksSold, String moneyEarned, String dateVisited) {
        this.placeName = placeName;
        this.booksSold = booksSold;
        this.moneyEarned = moneyEarned;
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

    public String getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(String moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public String getDateVisited() {
        return dateVisited;
    }

    public void setDateVisited(String dateVisited) {
        this.dateVisited = dateVisited;
    }
}
