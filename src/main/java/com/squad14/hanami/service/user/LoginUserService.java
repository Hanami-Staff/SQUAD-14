package com.squad14.hanami.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.exception.IncorrectCredentialsException;
import com.squad14.hanami.model.User;
import com.squad14.hanami.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class LoginUserService {
  @Autowired
  private UserRepository userRepository;

  public Optional<User> login(String email, String password) {
    System.out.println(email);
    Optional<User> user = userRepository.findByEmail(email);
    if (!user.isPresent()) {
      throw new EntityNotFoundException("Usúario não encontrado.");
    } else {
      if (user.get().getPassword().equals(password)) {
        return user;
      } else {
        throw new IncorrectCredentialsException();
      }
    }
  }
}
