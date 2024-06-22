package com.squad14.hanami.dto.comment;

import com.squad14.hanami.model.Comment;

import java.util.Optional;

public record UpdateCommentDTO(Optional<String> content) {
  public UpdateCommentDTO(Comment comment) {
    this(Optional.ofNullable(comment.getContent()));
  }
}
