package com.example.demo.model;

public class Post {
    String text;
    Integer likes;
    public Post(String text){
        this.text = text;
    }

    public Integer getLikes() {
        return likes;
    }
    public String getText() {
        return text;
    }
}
