package com.squad14.hanami.service.user;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.model.User;
import com.squad14.hanami.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class GetIdUserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(UUID id) {
        if (!userRepository.findById(id).isPresent()) {
            throw new EntityNotFoundException("Usuário não encotrado.");
        }
        return userRepository.findById(id);
    }
}
