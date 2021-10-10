package com.latrosoft.l_earning.Model;

public class Course {
    String id,title,imgLink,price,orginalPrice,dis;

    public Course(String id, String title, String imgLink, String price, String orginalPrice, String dis) {
        this.id = id;
        this.title = title;
        this.imgLink = imgLink;
        this.price = price;
        this.orginalPrice = orginalPrice;
        this.dis = dis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrginalPrice() {
        return orginalPrice;
    }

    public void setOrginalPrice(String orginalPrice) {
        this.orginalPrice = orginalPrice;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }
}
