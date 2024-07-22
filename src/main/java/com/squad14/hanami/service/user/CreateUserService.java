package com.squad14.hanami.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.dto.user.CreateUserDTO;
import com.squad14.hanami.model.User;
import com.squad14.hanami.repository.UserRepository;

@Service
public class CreateUserService {
  @Autowired
  private UserRepository userRepository;

  public User createUser(CreateUserDTO user) {
    User createdUser = new User();
    createdUser.setEmail(user.email());
    createdUser.setName(user.name());
    createdUser.setPassword(user.password());

    return userRepository.save(createdUser);
  }
}
