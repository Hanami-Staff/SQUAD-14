package com.squad14.hanami.service.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.squad14.hanami.dto.user.UpdateUserDTO;
import com.squad14.hanami.model.User;
import com.squad14.hanami.repository.UserRepository;

@Service
public class UpdateUserService {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private GetIdUserService getIdUserService;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public String updateUser(UUID id, UpdateUserDTO user) {
    User updatedUser = getIdUserService.getUserById(id).get();

    user.name().ifPresent(updatedUser::setName);

    user.password().ifPresent(password -> {
      String encodedPassword = passwordEncoder.encode(password);
      updatedUser.setPassword(encodedPassword);
    });

    user.email().ifPresent(updatedUser::setEmail);

    userRepository.save(updatedUser);
    return "Usuário atualizado com sucesso.";
  }
}