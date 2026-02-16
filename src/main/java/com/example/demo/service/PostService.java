package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> posts;

    public PostService() {
        List<Post> posts = new ArrayList<>(List.of(
                new Post(0L, "first", new Date()),
                new Post(1L, "second", new Date()),
                new Post(2L, "third", new Date()))
        );
        this.posts = posts;
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(Long.valueOf(posts.size() - 1), text, new Date()));
    }
}
