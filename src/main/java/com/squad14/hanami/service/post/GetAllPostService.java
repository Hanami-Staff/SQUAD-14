package com.squad14.hanami.service.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.dto.post.PostDTO;

import com.squad14.hanami.repository.PostRepository;

@Service
public class GetAllPostService {
  @Autowired
  private PostRepository postRepository;

  public List<PostDTO> getAllPost(){
    List<PostDTO> posts=postRepository.findAll().stream().map(PostDTO::new).toList();
    return posts;
  }

}
