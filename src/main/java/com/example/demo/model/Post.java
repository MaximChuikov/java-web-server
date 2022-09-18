package com.example.demo.model;

import java.util.Date;

public class Post {
    Long id;
    String text;
    int likes;
    private final Date creationDate;

    public Post(Long postId, String text, Date creationDate) {
        this.id = postId;
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public Long getId(){return id;}

    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes){this.likes = likes;}

    public String getText() {
        return text;
    }

}
