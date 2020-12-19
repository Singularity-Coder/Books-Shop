package com.singularitycoder.brhatmrdanga.home.model;

public class BookModel {

    int imgBookImage;
    String strBookName;
    String strBooksAvailable;
    String strBooksSold;

    public BookModel(int imgBookImage, String strBookName, String strBooksAvailable, String strBooksSold) {
        this.imgBookImage = imgBookImage;
        this.strBookName = strBookName;
        this.strBooksAvailable = strBooksAvailable;
        this.strBooksSold = strBooksSold;
    }

    public int getImgBookImage() {
        return imgBookImage;
    }

    public void setImgBookImage(int imgBookImage) {
        this.imgBookImage = imgBookImage;
    }

    public String getStrBookName() {
        return strBookName;
    }

    public void setStrBookName(String strBookName) {
        this.strBookName = strBookName;
    }

    public String getStrBooksAvailable() {
        return strBooksAvailable;
    }

    public void setStrBooksAvailable(String strBooksAvailable) {
        this.strBooksAvailable = strBooksAvailable;
    }

    public String getStrBooksSold() {
        return strBooksSold;
    }

    public void setStrBooksSold(String strBooksSold) {
        this.strBooksSold = strBooksSold;
    }
}
