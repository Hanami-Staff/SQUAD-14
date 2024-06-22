package com.squad14.hanami.service.comment;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.repository.CommentRepository;

@Service
public class DeleteCommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private GetIdCommentService getIdService;

    public String deleteComment(UUID id) {
        getIdService.getCommentById(id);
        commentRepository.deleteById(id);
        return "Commentario excluído com sucesso!!!";
    }
}
