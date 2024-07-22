package com.squad14.hanami.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.user.CreateUserDTO;
import com.squad14.hanami.dto.user.UserDTO;
import com.squad14.hanami.exception.InvalidFieldException;
import com.squad14.hanami.service.user.CreateUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class CreateUserController {
  @Autowired
  private CreateUserService createUserService;

  @PostMapping
  public ResponseEntity<UserDTO> createUser(@RequestBody CreateUserDTO user) {

    if (user.name() == null || user.name().isBlank()) {
      throw new InvalidFieldException("Nome");
    }

    if (user.email() == null || user.email().isBlank()) {
      throw new InvalidFieldException("Email");
    }

    if (user.password() == null || user.password().isBlank()) {
      throw new InvalidFieldException("Senha");
    }

    UserDTO createdUser = new UserDTO(createUserService.createUser(user));

    return ResponseEntity.ok().body(createdUser);
  }
}
