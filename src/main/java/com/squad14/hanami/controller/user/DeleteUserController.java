package com.squad14.hanami.controller.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad14.hanami.service.user.DeleteUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class DeleteUserController {

    @Autowired
    private DeleteUserService deleteService;

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable UUID id) {

        return deleteService.deleteUser(id);
    }
}
