package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = List.of(
                new Post("first"),
                new Post("second"),
                new Post("third")
        );
        return posts;
    }
}
