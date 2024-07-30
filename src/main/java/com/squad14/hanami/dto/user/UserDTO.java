package com.squad14.hanami.dto.user;

import java.util.UUID;

import com.squad14.hanami.model.User;

public record UserDTO(UUID id, String name, String email) {
  public UserDTO(User user) {
    this(user.getId(), user.getName(), user.getEmail());
  }
}
