package com.singularitycoder.brhatmrdanga.home;

public class TeamsModel {

    int intTeamImage;
    String strTeamName;
    String strBooksSold;
    String strLakshmiEarned;

    public TeamsModel(int intTeamImage, String strTeamName, String strBooksSold, String strLakshmiEarned) {
        this.intTeamImage = intTeamImage;
        this.strTeamName = strTeamName;
        this.strBooksSold = strBooksSold;
        this.strLakshmiEarned = strLakshmiEarned;
    }

    public int getIntTeamImage() {
        return intTeamImage;
    }

    public void setIntTeamImage(int intTeamImage) {
        this.intTeamImage = intTeamImage;
    }

    public String getStrTeamName() {
        return strTeamName;
    }

    public void setStrTeamName(String strTeamName) {
        this.strTeamName = strTeamName;
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
}
