package com.squad14.hanami.dto.post;

import com.squad14.hanami.model.Post;


import java.util.Optional;

public record UpdatePostDTO(Optional<String> title, Optional<String> content) {
    public UpdatePostDTO(Post post){
        this(Optional.ofNullable(post.getTitle()), Optional.ofNullable(post.getContent()));
    }
}
