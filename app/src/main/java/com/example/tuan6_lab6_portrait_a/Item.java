package com.example.tuan6_lab6_portrait_a;

public class Item {

    private int imgLogo;
    private String description;

    public Item(int imgLogo, String description) {
        this.imgLogo = imgLogo;
        this.description = description;
    }

    public int getImgLogo() {
        return imgLogo;
    }

    public void setImgLogo(int imgLogo) {
        this.imgLogo = imgLogo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
