package com.squad14.hanami.controller.post;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.service.post.DeletePostService;

@RestController
@RequestMapping("/posts")
public class DeletePostController {
    @Autowired
    private DeletePostService deleteService;

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable UUID id) {

        return deleteService.deletePost(id);
    }

}