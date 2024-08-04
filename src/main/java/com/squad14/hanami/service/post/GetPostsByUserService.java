package com.squad14.hanami.service.post;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.dto.post.PostDTO;

import com.squad14.hanami.repository.PostRepository;

@Service
public class GetPostsByUserService {
  @Autowired
  private PostRepository postRepository;

  public List<PostDTO> getPostsByUser(UUID userId) {
    List<PostDTO> posts = postRepository.findByUserId(userId).stream().map(PostDTO::new).toList();
    return posts;
  }
}