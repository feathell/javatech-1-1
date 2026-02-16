package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date date) {
        this.text = text;
        this.creationDate = date;
        this.likes = 0;
        this.id = id;
    }

    public String getText() { return this.text; }

    public Integer getLikes() { return this.likes; }

    public Date getCreationDate() { return this.creationDate; }

    public Long getId() { return this.id; }

    public void setText(String text) { this.text = text; }

    public void setLikes(Integer likes) { this.likes = likes; }
}
