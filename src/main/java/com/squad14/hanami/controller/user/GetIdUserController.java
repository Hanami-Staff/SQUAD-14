package com.squad14.hanami.controller.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.user.UserDTO;
import com.squad14.hanami.service.user.GetIdUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class GetIdUserController {

    @Autowired
    private GetIdUserService getIdService;

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable UUID id) {
        UserDTO user = new UserDTO(getIdService.getUserById(id).get());
        return ResponseEntity.status(HttpStatus.OK).body(user);

    }
}
