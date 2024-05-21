package com.squad14.hanami.dto.post;

import com.squad14.hanami.model.Post;

import java.util.Date;
import java.util.UUID;

public record PostDTO(UUID id, String title, String content, Date createdAt) {
    public PostDTO(Post post){
        this(post.getId(), post.getTitle(), post.getContent(), post.getCreatedAt());
    }
}
