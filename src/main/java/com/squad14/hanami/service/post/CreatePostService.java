package com.squad14.hanami.service.post;

import com.squad14.hanami.dto.post.CreatePostDTO;
import com.squad14.hanami.model.Post;
import com.squad14.hanami.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CreatePostService {
    @Autowired
    private PostRepository postRepository;

    public Post createPost(CreatePostDTO post) {
        Post createdPost = new Post();
        createdPost.setTitle(post.title());
        createdPost.setContent(post.content());
        createdPost.setCreatedAt(new Date());

        return postRepository.save(createdPost);
    }
}
