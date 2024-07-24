package com.squad14.hanami.dto.user;

import java.util.Optional;

import com.squad14.hanami.model.User;

public record UpdateUserDTO(Optional<String> name, Optional<String> email, Optional<String> password) {
  public UpdateUserDTO(User user) {
    this(Optional.ofNullable(user.getName()), Optional.ofNullable(user.getEmail()),
        Optional.ofNullable(user.getPassword()));
  }
}