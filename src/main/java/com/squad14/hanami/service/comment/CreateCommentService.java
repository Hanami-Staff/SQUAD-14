package com.squad14.hanami.service.comment;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.dto.comment.CreateCommentDTO;
import com.squad14.hanami.model.Comment;
import com.squad14.hanami.repository.CommentRepository;
import com.squad14.hanami.service.post.GetIdPostService;
import com.squad14.hanami.service.user.GetIdUserService;

@Service
public class CreateCommentService {
  @Autowired
  private CommentRepository commentRepository;

  @Autowired
  private GetIdPostService getPostService;

  @Autowired
  private GetIdUserService getUserService;

  public Comment createComment(CreateCommentDTO comment) {
    Comment createdComment = new Comment();
    createdComment.setContent(comment.content());
    createdComment.setPost(getPostService.getPostById(comment.postId()).get());
    createdComment.setUser(getUserService.getUserById(comment.userId()).get());
    createdComment.setCreatedAt(new Date());
    return commentRepository.save(createdComment);
  }
}
