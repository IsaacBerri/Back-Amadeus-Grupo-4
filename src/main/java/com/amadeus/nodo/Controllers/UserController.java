package com.amadeus.nodo.Controllers;

import com.amadeus.nodo.Models.UserEntity;
import com.amadeus.nodo.Services.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserSevice userSevice;

    @GetMapping("/users")
    public List<UserEntity> findAll() {
        return userSevice.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<UserEntity> findById(@PathVariable int id) {
        return userSevice.findById(id);
    }

    @PostMapping("/user")
    public String create(@RequestBody UserEntity userEntity) {
        userSevice.create(userEntity);
        return "Usuario creado con exito";
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable int id) {
        userSevice.delete(id);
        return "Usuario eliminado con exito";
    }

}
