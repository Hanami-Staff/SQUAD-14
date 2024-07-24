package com.squad14.hanami.controller.post;

import com.squad14.hanami.dto.post.UpdatePostDTO;
import com.squad14.hanami.exception.InvalidFieldException;
import com.squad14.hanami.model.Post;
import com.squad14.hanami.service.post.UpdatePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class UpdatePostController {
    @Autowired
    private UpdatePostService updateService;

    @PutMapping("/{id}")
    public String updatePost(@PathVariable UUID id, @RequestBody Post post) {
        if (!(post.getTitle() == null) && post.getTitle().isBlank()) {
            throw new InvalidFieldException("Titúlo");
        }

        if (!(post.getContent() == null) && post.getContent().isBlank()) {
            throw new InvalidFieldException("Conteúdo");
        }

        UpdatePostDTO updatePost = new UpdatePostDTO(post);

        return updateService.updatePost(id, updatePost);
    }
}
