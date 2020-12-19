package com.singularitycoder.brhatmrdanga.home.model;

public class TeamModel {

    int imgTeamImage;
    String teamName;
    String memberCount;
    String booksSold;
    String moneyEarned;
    String booksTaken;

    public TeamModel() {
    }

    public TeamModel(String teamName, String memberCount, String booksSold, String moneyEarned, String booksTaken) {
        this.teamName = teamName;
        this.memberCount = memberCount;
        this.booksSold = booksSold;
        this.moneyEarned = moneyEarned;
        this.booksTaken = booksTaken;
    }

    public TeamModel(String teamName, String booksSold, String moneyEarned) {
        this.teamName = teamName;
        this.booksSold = booksSold;
        this.moneyEarned = moneyEarned;
    }

    public TeamModel(int imgTeamImage, String teamName, String booksSold, String moneyEarned) {
        this.imgTeamImage = imgTeamImage;
        this.teamName = teamName;
        this.booksSold = booksSold;
        this.moneyEarned = moneyEarned;
    }

    public int getImgTeamImage() {
        return imgTeamImage;
    }

    public void setImgTeamImage(int imgTeamImage) {
        this.imgTeamImage = imgTeamImage;
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

    public String getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(String moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public String getBooksTaken() {
        return booksTaken;
    }

    public void setBooksTaken(String booksTaken) {
        this.booksTaken = booksTaken;
    }
}
