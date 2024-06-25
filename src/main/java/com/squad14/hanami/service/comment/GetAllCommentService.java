package com.squad14.hanami.service.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.dto.comment.CommentDTO;

import com.squad14.hanami.repository.CommentRepository;

@Service
public class GetAllCommentService {
  @Autowired
  private CommentRepository commentRepository;

  public List<CommentDTO> getAllComment(){
    List<CommentDTO> comments=commentRepository.findAll().stream().map(CommentDTO::new).toList();
    return comments;
  }

}
