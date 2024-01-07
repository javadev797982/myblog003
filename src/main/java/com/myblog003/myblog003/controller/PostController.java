package com.myblog003.myblog003.controller;

import com.myblog003.myblog003.payload.PostDto;
import com.myblog003.myblog003.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

 private PostService postservice;

    public PostController(PostService postservice) {
        this.postservice = postservice;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto dto = postservice.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}
