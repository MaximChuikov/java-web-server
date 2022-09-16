package com.example.demo.model;

import java.util.Date;

public class Post {
    String text;
    Integer likes;
    private final Date creationDate;

    public Post(String text, Integer likes, Date creationDate) {
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

}
