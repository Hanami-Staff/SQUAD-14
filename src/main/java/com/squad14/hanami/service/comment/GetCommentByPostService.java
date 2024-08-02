package com.squad14.hanami.service.comment;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.dto.comment.CommentDTO;
import com.squad14.hanami.repository.CommentRepository;

@Service
public class GetCommentByPostService {
  @Autowired
  private CommentRepository commentRepository;

  public List<CommentDTO> getCommentByPost(UUID postId) {
    return commentRepository.findByPostId(postId).stream().map(CommentDTO::new).toList();
  }
}
