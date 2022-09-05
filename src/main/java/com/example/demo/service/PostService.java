package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList listAllPosts() {
        Post post1 = new Post("текст 1");
        Post post2 = new Post("текст 2");
        Post post3 = new Post("текст 3");

        ArrayList<Post> list = new ArrayList<>();

        list.add(post1);
        list.add(post2);
        list.add(post3);

        return list;
    }
}