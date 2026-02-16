package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Date date) {
        this.text = text;
        this.creationDate = date;
        this.likes = 0;
    }

    public String getText() { return this.text; }

    public Integer getLikes() { return this.likes; }

    public Date getCreationDate() { return this.creationDate; }

    public void setText(String text) { this.text = text; }

    public void setLikes(Integer likes) { this.likes = likes; }
}
