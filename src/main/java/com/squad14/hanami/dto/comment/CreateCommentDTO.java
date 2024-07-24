package com.squad14.hanami.dto.comment;

import java.util.UUID;

import com.squad14.hanami.model.Comment;

public record CreateCommentDTO(UUID postId, UUID userId, String content) {
  public CreateCommentDTO(Comment comment) {
    this(comment.getPost().getId(), comment.getUser().getId(), comment.getContent());
  }
}
