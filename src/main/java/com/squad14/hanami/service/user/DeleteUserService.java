package com.squad14.hanami.service.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squad14.hanami.repository.UserRepository;

@Service
public class DeleteUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GetIdUserService getIdService;

    public String deleteUser(UUID id) {
        getIdService.getUserById(id);
        userRepository.deleteById(id);
        return "Usuário exluido com sucesso!!!";
    }
}
