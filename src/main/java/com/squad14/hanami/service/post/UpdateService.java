package com.squad14.hanami.service.post;

import com.squad14.hanami.dto.post.PostDTO;
import com.squad14.hanami.dto.post.UpdatePostDTO;
import com.squad14.hanami.model.Post;
import com.squad14.hanami.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UpdateService {

    @Autowired
    private GetIdService getIdService;

    @Autowired
    private PostRepository postRepository;

    public String updatePost(UUID id, UpdatePostDTO post){
        Post updatedPost = getIdService.getPostById(id).get();
        updatedPost.setTitle(post.title());
        updatedPost.setContent(post.content());
        postRepository.save(updatedPost);
        return "Postagem atualizada com sucesso!!!";
    }
}
