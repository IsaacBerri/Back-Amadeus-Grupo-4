package com.amadeus.nodo.Controllers;

import com.amadeus.nodo.Contracts.UserDTO;
import com.amadeus.nodo.Models.UserEntity;
import com.amadeus.nodo.Service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserSevice userSevice;

    @GetMapping("/users")
    public List<UserDTO> findAll() {
        return userSevice.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<UserDTO> findById(@PathVariable int id) {
        return userSevice.findById(id);
    }

    @PostMapping("/user")
    public String create(@RequestBody UserDTO userDTO) {
        userSevice.create(userDTO);
        return "Usuario creado con exito";
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable int id) {
        userSevice.delete(id);
        return "Usuario eliminado con exito";
    }

}
