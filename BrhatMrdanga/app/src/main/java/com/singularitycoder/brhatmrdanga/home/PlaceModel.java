package com.singularitycoder.brhatmrdanga.home;

public class PlaceModel {

    String strName;
    String strBooksSold;
    String strLakshmiEarned;
    String strDate;

    public PlaceModel(String strName, String strBooksSold, String strLakshmiEarned, String strDate) {
        this.strName = strName;
        this.strBooksSold = strBooksSold;
        this.strLakshmiEarned = strLakshmiEarned;
        this.strDate = strDate;
    }

    public PlaceModel(String strName, String strDate) {
        this.strName = strName;
        this.strDate = strDate;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrBooksSold() {
        return strBooksSold;
    }

    public void setStrBooksSold(String strBooksSold) {
        this.strBooksSold = strBooksSold;
    }

    public String getStrLakshmiEarned() {
        return strLakshmiEarned;
    }

    public void setStrLakshmiEarned(String strLakshmiEarned) {
        this.strLakshmiEarned = strLakshmiEarned;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }
}
