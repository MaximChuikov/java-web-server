package com.example.service;

import com.example.repository.PostRepository;
import com.example.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    PostRepository postRepository;
    public int like(Long postId){
        Post post = postRepository.findById(postId).get();
        post.setLikes(post.getLikes() + 1);
        postRepository.save(post);
        return post.getLikes();
    }
}
