package com.squad14.hanami.controller.comment;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.squad14.hanami.dto.comment.CommentDTO;
import com.squad14.hanami.service.comment.GetCommentByPostService;

@RestController
@RequestMapping("/commentsByPost")
@CrossOrigin("*")
public class GetCommentByPostController {

  @Autowired
  private GetCommentByPostService getCommentByPostService;

  @GetMapping("/{postId}")
  public ResponseEntity<List<CommentDTO>> getCommentByPost(@PathVariable UUID postId) {
    List<CommentDTO> comments = getCommentByPostService.getCommentByPost(postId);

    return ResponseEntity.ok().body(comments);
  }

}
