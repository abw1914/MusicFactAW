package com.android.musicfactoryaw.MusicData;

public class Jazz {

    private String Artist;
    private String Song;
    private int resourceJazzIcon;

    public Jazz(String artist, String song, int resourceJazzIcon) {
        Artist = artist;
        Song = song;
        this.resourceJazzIcon = resourceJazzIcon;
    }

    public int getResourceJazzIcon() {
        return resourceJazzIcon;
    }

    public void setResourceJazzIcon(int resourceJazzIcon) {
        this.resourceJazzIcon = resourceJazzIcon;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getSong() {
        return Song;
    }

    public void setSong(String song) {
        Song = song;
    }
}
