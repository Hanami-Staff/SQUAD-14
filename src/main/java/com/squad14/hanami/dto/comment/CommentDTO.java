package com.squad14.hanami.dto.comment;

import java.util.Date;
import java.util.UUID;

import com.squad14.hanami.model.Comment;

public record CommentDTO(UUID id, String content, Date createdAt, UUID postId) {
  public CommentDTO(Comment comment) {
    this(comment.getId(), comment.getContent(), comment.getCreatedAt(), comment.getPost().getId());
  }
}
