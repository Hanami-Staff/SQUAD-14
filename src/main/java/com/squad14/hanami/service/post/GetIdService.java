package com.squad14.hanami.service.post;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.model.Post;
import com.squad14.hanami.repository.PostRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class GetIdService {
    @Autowired
    private PostRepository postRepository;

    public Optional<Post> getPostById(UUID id) {
        if (!postRepository.findById(id).isPresent()) {
            throw new EntityNotFoundException("Postagem não encontrada.");
        }
        return postRepository.findById(id);
    }
}
