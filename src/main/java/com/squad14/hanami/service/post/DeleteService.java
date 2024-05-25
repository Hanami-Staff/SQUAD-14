package com.squad14.hanami.service.post;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.repository.PostRepository;

@Service
public class DeleteService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private GetIdService getIdService;

    public String deletePost(UUID id) {
        getIdService.getPostById(id);
        postRepository.deleteById(id);
        return "Postagem excluída com sucesso!!!";
    }
}
