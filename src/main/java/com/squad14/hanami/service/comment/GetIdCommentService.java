package com.squad14.hanami.service.comment;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.model.Comment;
import com.squad14.hanami.repository.CommentRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class GetIdCommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Optional<Comment> getCommentById(UUID id) {
        if (!commentRepository.findById(id).isPresent()) {
            throw new EntityNotFoundException("Comentário não encontrado.");
        }
        return commentRepository.findById(id);
    }
}
