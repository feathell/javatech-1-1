package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date dateCreation;

    public Post(String text) {
        this.text = text;
        this.dateCreation = new Date();
    }

    public String getText() { return this.text; }

    public Integer getLikes() { return this.likes; }

    public Date getDateCreation() { return this.dateCreation; }

    public void setText(String text) { this.text = text; }

    public void setLikes(Integer likes) { this.likes = likes; }
}
