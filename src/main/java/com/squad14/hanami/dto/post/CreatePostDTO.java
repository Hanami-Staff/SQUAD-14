package com.squad14.hanami.dto.post;

import java.util.UUID;

import com.squad14.hanami.model.Post;

public record CreatePostDTO(UUID userId, String title, String content) {
    public CreatePostDTO(Post post) {
        this(post.getUser().getId(), post.getTitle(), post.getContent());
    }
}
