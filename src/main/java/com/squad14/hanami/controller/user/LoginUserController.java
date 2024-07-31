package com.squad14.hanami.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.dto.user.LoginUserDTO;
import com.squad14.hanami.dto.user.UserDTO;
import com.squad14.hanami.model.User;
import com.squad14.hanami.service.user.LoginUserService;

@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class LoginUserController {
  @Autowired
  private LoginUserService loginUserService;

  @PostMapping
  public ResponseEntity<UserDTO> login(@RequestBody LoginUserDTO credentials) {
    User user = loginUserService.login(credentials.email(), credentials.password()).get();
    UserDTO userDTO = new UserDTO(user);
    return ResponseEntity.ok().body(userDTO);
  }
}
