package com.latrosoft.l_earning.Model;

public class Banner {
    String imageLink;
    String id;

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Banner(String imageLink, String id) {
        this.imageLink = imageLink;
        this.id = id;
    }
}
