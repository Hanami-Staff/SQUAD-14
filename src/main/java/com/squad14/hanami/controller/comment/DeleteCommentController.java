package com.squad14.hanami.controller.comment;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.service.comment.DeleteCommentService;

@RestController
@RequestMapping("/comments")
public class DeleteCommentController {
    @Autowired
    private DeleteCommentService deleteService;

    @DeleteMapping("/{id}")
    public String deleteComment(@PathVariable UUID id) {

        return deleteService.deleteComment(id);
    }

}