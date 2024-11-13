package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
// @RequestMapping("/posts") // url/posts
@RequiredArgsConstructor // final로 지정된 필드들의 생성자 주입을 자동으로 해줌
@Slf4j
public class PostController {

//    @GetMapping("/")
//    public String a(){
//        return "블로그 목록입니다.";
//    }
    /*
    @GetMapping("/list")
    public String postlist(){
        return "블로그 목록입니다.";
    }

    // http://localhost:8080/posts/1
    // 경로 변수(path variable)를 @PathVariable을 통해 받아올 수 있다.
    // 받은 데이터 타입을 정하고 @PathVariable에 지정한 변수명과 경로 변수명을 맞춰주면 된다.
    @GetMapping("/{postId}")
    public String postDetail(@PathVariable String postId){
        return postId + "블로그 내용입니다.";
    }

    // http://localhost:8080/posts/update?postId=1
    // ?뒤에 변수에 데이터를 넘어서 보내는 방식
    // @RequestParam을 통해 받아올 수 있다.
    @GetMapping("/update")
    public String updatePost(@RequestParam String postId){
        return postId + "블로그 내용입니다.";
    }

     */

    /*
    // 여러 개의 게시글(Post) 객체를 담은 리스트(List<Post>)를 반환하는 메서드.
    // 이 메서드는 Post 객체들을 생성하고, 이를 리스트에 추가한 후 그 리스트를 반환한다.
    @GetMapping("/list")
    public List<Post> postlist(){
        return List.of(
            new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now()),
            new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now()),
            new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now())
        );
    }

    // http://localhost:8080/posts/1
    // 경로 변수(path variable)를 @PathVariable을 통해 받아올 수 있다.
    // 받은 데이터 타입을 정하고 @PathVariable에 지정한 변수명과 경로 변수명을 맞춰주면 된다.
    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now());
    }

     */

    // @Autowired: 예전에는 이 방식으로 의존성 주입을 했지만 현재는 생성자 주입을 통해서 필드 세팅이 권장사항
    // private final PostService postService;

    private final PostService postService;

    // 이것조차 @RequiredArgsConstructor를 사용하면 lombok이 알아서 생성자를 만들어준다.
    // 아래가 생성자 주입 방식
    // @Autowired
    // public PostController(PostService postService){
    //     this.postService = postService;
    // }

    @GetMapping("/list")
    public List<Post> postlist(){
        return postService.postList();
    }


    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now());
    }
}
