package com.squad14.hanami.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squad14.hanami.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
  List<Comment> findByPostId(UUID postId);
}
