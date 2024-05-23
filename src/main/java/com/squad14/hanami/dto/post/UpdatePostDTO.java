package com.squad14.hanami.dto.post;

import com.squad14.hanami.model.Post;

public record UpdatePostDTO(String title, String content) {
    public UpdatePostDTO(Post post){
        this(post.getTitle(), post.getContent());
    }
}
