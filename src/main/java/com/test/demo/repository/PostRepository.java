package com.test.demo.repository;

import com.test.demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository // JpaRepository를 상속받은 경우에는 생략 가능
public interface PostRepository extends JpaRepository<Post, UUID> {

}
