package com.example.demo.model;

public class Post {
    private String text;
    private Integer likes;

    public Post(String text) {
        this.text = text;
    }

    public String getText() { return this.text; }

    public Integer getLikes() { return this.likes; }

    public void setText(String text) { this.text = text; }

    public void setLikes(Integer likes) { this.likes = likes; }
}
