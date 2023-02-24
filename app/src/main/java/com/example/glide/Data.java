package com.example.glide;



public class Data {
    String titel;

    public Data(String titel, String image) {
        this.titel = titel;
        this.image = image;
    }

    String image;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
