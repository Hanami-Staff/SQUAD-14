package com.squad14.hanami.controller.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.comment.CommentDTO;
import com.squad14.hanami.dto.comment.CreateCommentDTO;
import com.squad14.hanami.exception.InvalidFieldException;
import com.squad14.hanami.service.comment.CreateCommentService;

@RestController
@RequestMapping("/comments")
@CrossOrigin("*")
public class CreateCommentController {
  @Autowired
  private CreateCommentService createService;

  @PostMapping
  public ResponseEntity<CommentDTO> createComment(@RequestBody CreateCommentDTO comment) {
    if (comment.content() == null || comment.content().isBlank()) {
      throw new InvalidFieldException("Comentario");
    }

    if (comment.postId() == null || comment.postId() == null) {
      throw new InvalidFieldException("ID da postagem");
    }

    CommentDTO createdComment = new CommentDTO(createService.createComment(comment));
    return ResponseEntity.status(HttpStatus.CREATED).body(createdComment);
  }
}
