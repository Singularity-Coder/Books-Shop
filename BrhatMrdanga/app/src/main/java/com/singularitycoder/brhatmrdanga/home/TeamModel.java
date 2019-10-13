package com.singularitycoder.brhatmrdanga.home;

public class TeamModel {

    String teamName;
    String memberCount;
    String booksSold;
    String lakshmiEarned;
    String booksTaken;

    public TeamModel() {
    }

    public TeamModel(String teamName, String memberCount, String booksSold, String lakshmiEarned, String booksTaken) {
        this.teamName = teamName;
        this.memberCount = memberCount;
        this.booksSold = booksSold;
        this.lakshmiEarned = lakshmiEarned;
        this.booksTaken = booksTaken;
    }

    public TeamModel(String teamName, String booksSold, String lakshmiEarned) {
        this.teamName = teamName;
        this.booksSold = booksSold;
        this.lakshmiEarned = lakshmiEarned;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(String memberCount) {
        this.memberCount = memberCount;
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

    public String getBooksTaken() {
        return booksTaken;
    }

    public void setBooksTaken(String booksTaken) {
        this.booksTaken = booksTaken;
    }
}
