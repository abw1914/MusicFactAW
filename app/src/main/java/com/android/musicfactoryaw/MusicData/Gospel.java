package com.android.musicfactoryaw.MusicData;

public class Gospel {
    private String Song;
    private String Artist;
    private String Genre;
    private String songLength;
    private int resourceFolderId;

    public Gospel(String song, String artist, String genre, String songLength, int resourceFolderId) {
        Song = song;
        Artist = artist;
        Genre = genre;
        this.songLength = songLength;
        this.resourceFolderId = resourceFolderId;
    }

    public int getResourceFolderId() {
        return resourceFolderId;
    }

    public void setResourceFolderId(int resourceFolderId) {
        this.resourceFolderId = resourceFolderId;
    }

    public String getSong() {
        return Song;
    }

    public void setSong(String song) {
        Song = song;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getSongLength() {
        return songLength;
    }

    public void setSongLength(String songLength) {
        this.songLength = songLength;
    }
}
