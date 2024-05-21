package com.squad14.hanami.controller.post;

import com.squad14.hanami.dto.post.CreatePostDTO;
import com.squad14.hanami.dto.post.PostDTO;
import com.squad14.hanami.exception.InvalidFieldException;
import com.squad14.hanami.service.post.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class CreateController {
    @Autowired
    private CreateService createService;

    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody CreatePostDTO post){
        if(post.title().isBlank()){
            throw  new InvalidFieldException("Titulo");
        }

        if(post.content().isBlank()){
            throw  new InvalidFieldException("Conteudo");
        }

        PostDTO createdPost = new PostDTO(createService.createPost(post));
        return ResponseEntity.ok().body(createdPost);
    }
}
