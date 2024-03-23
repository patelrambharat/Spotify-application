package com.driver.Spotify;

public class Artist {
    private String name;
    private int likes;

    public Artist(String name) {
    }

//    public Artist(String name, int likes) {
//        this.name = name;
//        this.likes = likes;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
