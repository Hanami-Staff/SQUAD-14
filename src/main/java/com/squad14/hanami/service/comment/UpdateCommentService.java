package com.squad14.hanami.service.comment;

import com.squad14.hanami.dto.comment.UpdateCommentDTO;
import com.squad14.hanami.model.Comment;
import com.squad14.hanami.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UpdateCommentService {

  @Autowired
  private GetIdCommentService getIdService;

  @Autowired
  private CommentRepository commentRepository;

  public String updateComment(UUID id, UpdateCommentDTO comment) {
    Comment updatedComment = getIdService.getCommentById(id).get();
    comment.content().ifPresent(updatedComment::setContent);

    commentRepository.save(updatedComment);
    return "Comentario atualizado com sucesso!!!";
  }
}
