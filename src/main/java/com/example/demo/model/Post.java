package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor //기본 생성자(파라미터 없는 생성자)를 자동으로 생성
@Builder // 빌더 패턴을 사용해 객체를 생성할 수 있게 해줌
@Entity // 해당 클래스가 데이터베이스의 테이블과 매핑
@Data // 해당 클래스에 대해 getter, setter, toString, equals, hashCode 메서드를 자동으로 생성해주는 역할
@AllArgsConstructor // 해당 클래스에 모든 필드를 초기화하는 생성자를 자동으로 생성해주는 역할, 객체 생성 시 바로 값 할당 가능 new Post("New Post", "Content of the post");, 이게 없다면 setter로 값 할당
public class Post {

    @Id // 테이블의 기본키 설정
    @GeneratedValue(strategy = GenerationType.UUID) // JPA에서 엔티티의 기본 키(primary key)를 자동으로 생성하는 방식에 대한 설정입니다.
    private UUID postId;
    // UUID: Universally Unique Identifier의 약자로, 전 세계에서 고유한 식별자를 생성하는 방법
    // 고유한 값이 필요할 때 사용되며, 16바이트 크기의 값을 가집니다.


    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdDateTime;
}
