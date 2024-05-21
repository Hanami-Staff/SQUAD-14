package com.squad14.hanami.dto.post;

import com.squad14.hanami.model.Post;

public record CreatePostDTO(String title, String content) {
    public CreatePostDTO(Post post){
        this(post.getTitle(), post.getContent());
    }
}
