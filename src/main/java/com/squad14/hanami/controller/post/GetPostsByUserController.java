package com.squad14.hanami.controller.post;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.post.PostDTO;
import com.squad14.hanami.service.post.GetPostsByUserService;

@RestController
@RequestMapping("/postsByUser/{userId}")
@CrossOrigin("*")
public class GetPostsByUserController {
  @Autowired
  private GetPostsByUserService getPostsByUserService;

  @GetMapping
  public List<PostDTO> getAllPost(@PathVariable UUID userId) {
    List<PostDTO> posts = getPostsByUserService.getPostsByUser(userId);
    return posts;
  }
}
