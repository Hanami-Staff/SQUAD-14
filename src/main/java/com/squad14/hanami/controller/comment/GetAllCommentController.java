package com.squad14.hanami.controller.comment;

import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.comment.CommentDTO;
import com.squad14.hanami.service.comment.GetAllCommentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/comments")
public class GetAllCommentController {
    @Autowired
    private GetAllCommentService getAllService;

    @GetMapping
     public List<CommentDTO> getAllComment(){
    List<CommentDTO> comments=getAllService.getAllComment();
    return comments;
  }
    
    
    
}
