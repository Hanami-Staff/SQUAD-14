package com.squad14.hanami.controller.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.user.UpdateUserDTO;
import com.squad14.hanami.exception.InvalidFieldException;
import com.squad14.hanami.model.User;
import com.squad14.hanami.service.user.UpdateUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UpdateUserController {
  @Autowired
  private UpdateUserService updateUserService;

  @PutMapping("/{id}")
  public String updateUser(@PathVariable UUID id, @RequestBody User user) {
    if (!(user.getEmail() == null) && user.getEmail().isBlank()) {
      throw new InvalidFieldException("Email");
    }

    if (!(user.getName() == null) && user.getName().isBlank()) {
      throw new InvalidFieldException("Nome");
    }

    if (!(user.getPassword() == null) && user.getPassword().isBlank()) {
      throw new InvalidFieldException("Senha");
    }

    UpdateUserDTO updatedUser = new UpdateUserDTO(user);

    return updateUserService.updateUser(id, updatedUser);
  }

}
