package com.latrosoft.l_earning.Model;

public class PlayList {
    String videoUrl,title;

    public PlayList(String videoUrl, String title) {
        this.videoUrl = videoUrl;
        this.title = title;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
