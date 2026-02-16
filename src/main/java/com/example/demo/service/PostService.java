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
                new Post("first", new Date()),
                new Post("second", new Date()),
                new Post("third", new Date()))
        );
        this.posts = posts;
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
