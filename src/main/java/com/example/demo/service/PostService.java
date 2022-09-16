package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList listAllPosts() {
        Post post1 = new Post("текст 1", 11, new Date());
        Post post2 = new Post("текст 2", 34, new Date());
        Post post3 = new Post("текст 3", 8432, new Date());

        ArrayList<Post> list = new ArrayList<>();

        list.add(post1);
        list.add(post2);
        list.add(post3);

        return list;
    }
}