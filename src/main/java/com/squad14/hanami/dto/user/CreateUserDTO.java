package com.squad14.hanami.dto.user;

import com.squad14.hanami.model.User;

public record CreateUserDTO(String name, String email, String password) {
  public CreateUserDTO(User user) {
    this(user.getName(), user.getEmail(), user.getPassword());
  }
}
