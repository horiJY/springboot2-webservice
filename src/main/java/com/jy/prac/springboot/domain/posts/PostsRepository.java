package com.jy.prac.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {
    //기본 CRUD메소드가 자동 생성됨

    @Query("select p from Posts p order by p.id desc")
    List<Posts> findAllDesc();
}
