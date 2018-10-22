package com.android.musicfactoryaw.MusicData;

public class SlowJams {

    private String Artist;
    private String Album;
    private String Song;
    private int resourceImageId;

    public SlowJams(String artist, String album, String song, int resourceImageId) {
        Artist = artist;
        Album = album;
        Song = song;
        this.resourceImageId = resourceImageId;
    }

    public int getResourceImageId() {
        return resourceImageId;
    }

    public void setResourceImageId(int resourceImageId) {
        this.resourceImageId = resourceImageId;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getSong() {
        return Song;
    }

    public void setSong(String song) {
        Song = song;
    }
}
