package com.squad14.hanami.controller.post;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.post.PostDTO;
import com.squad14.hanami.model.Post;
import com.squad14.hanami.service.post.GetIdService;

@RestController
@RequestMapping("/posts/{id}")
public class GetIdController {
    @Autowired
    private GetIdService getIdService;

    @GetMapping
    public ResponseEntity<PostDTO> getPostById(@PathVariable UUID id) {
        Post post = getIdService.getPostById(id).get();
        PostDTO postDTO = new PostDTO(post);

        return ResponseEntity.status(HttpStatus.OK).body(postDTO);
    }
}
