package com.example.service;

import com.example.model.Post;
import org.springframework.stereotype.Component;

import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;
    @Autowired
    PostRepository postRepository;
    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }
    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
