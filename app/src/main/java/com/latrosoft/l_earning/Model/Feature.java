package com.latrosoft.l_earning.Model;

public class Feature {
    String imgeLink;
    String title;
    String originalPrice;

    String id;
    String Price;

    public Feature( String id, String title,String imgeLink, String originalPrice, String price) {
        this.imgeLink = imgeLink;
        this.title = title;
        this.originalPrice = originalPrice;
        this.id = id;
        Price = price;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgeLink() {
        return imgeLink;
    }

    public void setImgeLink(String imgeLink) {
        this.imgeLink = imgeLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
