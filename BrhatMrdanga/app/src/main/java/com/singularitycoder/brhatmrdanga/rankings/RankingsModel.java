package com.singularitycoder.brhatmrdanga.rankings;

public class RankingsModel {

    String strRank;
    int intRankUserPic;
    String strUserName;
    String strBooksSold;

    public RankingsModel(int intRankUserPic, String strUserName, String strRank, String strBooksSold) {
        this.intRankUserPic = intRankUserPic;
        this.strUserName = strUserName;
        this.strRank = strRank;
        this.strBooksSold = strBooksSold;
    }

    public String getStrRank() {
        return strRank;
    }

    public void setStrRank(String strRank) {
        this.strRank = strRank;
    }

    public int getIntRankUserPic() {
        return intRankUserPic;
    }

    public void setIntRankUserPic(int intRankUserPic) {
        this.intRankUserPic = intRankUserPic;
    }

    public String getStrUserName() {
        return strUserName;
    }

    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    public String getStrBooksSold() {
        return strBooksSold;
    }

    public void setStrBooksSold(String strBooksSold) {
        this.strBooksSold = strBooksSold;
    }
}
