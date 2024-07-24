package com.squad14.hanami.dto.post;

import com.squad14.hanami.model.Post;

import java.util.Date;
import java.util.UUID;

public record PostDTO(UUID id, UUID userId, String username, String title, String content, Date createdAt) {
    public PostDTO(Post post) {
        this(post.getId(), post.getUser().getId(), post.getUser().getName(), post.getTitle(), post.getContent(),
                post.getCreatedAt());
    }
}
