package com.squad14.hanami.repository;

import com.squad14.hanami.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
  List<Post> findByUserId(UUID userId);
}
