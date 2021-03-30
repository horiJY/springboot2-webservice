package com.jy.prac.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> {
    //기본 CRUD메소드가 자동 생성됨
}
