package com.driver.Spotify;

public class Song {
    private String title;
    private int length;
    private int likes;

    public Song(String title, int length) {
    }

    public Song(String title, int length, int likes) {
        this.title = title;
        this.length = length;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
