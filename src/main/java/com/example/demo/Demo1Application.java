package com.example.demo;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
    // CommandLineRunner를 사용하면 스프링부트가 실행되기 전에 초기 세팅을 설정할 수 있다.

    private final PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Post> PostList = List.of(
                new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title2", "contents2", "", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title3", "contents3", "", LocalDateTime.now())
        );

        postRepository.saveAll(PostList);
    }
}
