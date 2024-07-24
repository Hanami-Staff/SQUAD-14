package com.squad14.hanami.dto.comment;

import java.util.Date;
import java.util.UUID;

import com.squad14.hanami.model.Comment;

public record CommentDTO(UUID id, UUID postId, UUID userId, String username, String content, Date createdAt) {
  public CommentDTO(Comment comment) {
    this(comment.getId(), comment.getPost().getId(), comment.getUser().getId(), comment.getUser().getName(),
        comment.getContent(),
        comment.getCreatedAt());
  }
}
