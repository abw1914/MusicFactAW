package com.android.musicfactoryaw.MusicData;

public class Classical {
    private String Composer;
    private String Orchestra;
    private String title;
    private int imageResourceId;

    public Classical(String composer, String orchestra, String title, int imageResourceId) {
        Composer = composer;
        Orchestra = orchestra;
        this.title = title;
        this.imageResourceId = imageResourceId;
    }

    public String getComposer() {
        return Composer;
    }

    public void setComposer(String composer) {
        Composer = composer;
    }

    public String getOrchestra() {
        return Orchestra;
    }

    public void setOrchestra(String orchestra) {
        Orchestra = orchestra;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
