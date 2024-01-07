package com.myblog003.myblog003.repository;

import com.myblog003.myblog003.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
