package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private final ArrayList<Post> posts = new ArrayList<>();
    private long counter = 0L;
    public PostService(){
        create("ФЫОВтло ВФЫтлТ ВЫФТл");
        create("ФЫОВтло ВФЫтлТ ВЫФТл");
        create("ФЫОВтло ВФЫтлТ ВЫФТл");
    }
    public ArrayList<Post> listAllPosts() {
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(counter, text, new Date()));
        counter++;
    }
}
