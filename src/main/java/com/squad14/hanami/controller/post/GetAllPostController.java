package com.squad14.hanami.controller.post;

import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.post.PostDTO;
import com.squad14.hanami.service.post.GetAllPostService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/posts")
public class GetAllPostController {
    @Autowired
    private GetAllPostService getAllService;

    @GetMapping
     public List<PostDTO> getAllPost(){
    List<PostDTO> posts=getAllService.getAllPost();
    return posts;
  }
    
    
    
}
