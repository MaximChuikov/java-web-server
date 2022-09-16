package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private final ArrayList<Post> posts = new ArrayList<>();
    public PostService(){
        Post post1 = new Post("текст 1", 11, new Date());
        Post post2 = new Post("текст 2", 34, new Date());
        Post post3 = new Post("текст 3", 8432, new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
    }
    public ArrayList listAllPosts() {
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(text, 0, new Date()));
    }
}
