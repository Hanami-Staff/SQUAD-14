package com.squad14.hanami.controller.comment;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.comment.CommentDTO;
import com.squad14.hanami.service.comment.GetIdCommentService;

@RestController
@RequestMapping("/comments")
public class GetIdCommentController {

    @Autowired
    private GetIdCommentService getIdService;

    @GetMapping("/{id}")
    public ResponseEntity<CommentDTO> getCommentById(@PathVariable UUID id) {
        CommentDTO comment = new CommentDTO(getIdService.getCommentById(id).get());
        return ResponseEntity.status(HttpStatus.OK).body(comment);
    }
}
