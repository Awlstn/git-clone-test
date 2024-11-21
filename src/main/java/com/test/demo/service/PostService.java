package com.test.demo.service;

import com.test.demo.model.Post;
import com.test.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> postList() {
        return postRepository.findAll();
    }
}
