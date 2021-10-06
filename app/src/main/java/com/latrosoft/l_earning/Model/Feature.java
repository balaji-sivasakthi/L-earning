package com.latrosoft.l_earning.Model;

public class Feature {
    String imgeLink;
    String id;
    String Price;

    public Feature(String imgeLink, String id, String price) {
        this.imgeLink = imgeLink;
        this.id = id;
        Price = price;
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
