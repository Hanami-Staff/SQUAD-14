package com.squad14.hanami.controller.comment;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.comment.UpdateCommentDTO;
import com.squad14.hanami.exception.InvalidFieldException;
import com.squad14.hanami.model.Comment;
import com.squad14.hanami.service.comment.UpdateCommentService;

@RestController
@RequestMapping("/comments")
@CrossOrigin("*")
public class UpdateCommentController {
  @Autowired
  private UpdateCommentService updateService;

  @PutMapping("/{id}")
  public String updateComment(@PathVariable UUID id, @RequestBody Comment comment) {
    if (!(comment.getContent() == null)) {
      if (comment.getContent().isBlank()) {
        throw new InvalidFieldException("Conteúdo");
      }
    }

    UpdateCommentDTO updateComment = new UpdateCommentDTO(comment);

    return updateService.updateComment(id, updateComment);
  }
}