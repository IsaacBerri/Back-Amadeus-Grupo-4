package com.amadeus.nodo.Controllers;

import com.amadeus.nodo.Contracts.UserDTO;
import com.amadeus.nodo.Services.UserSevice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserSevice userSevice;

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> findAll() {
        return ResponseEntity.ok(userSevice.findAll());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<UserDTO>> findById(@PathVariable int id) {
        Optional<UserDTO> user = userSevice.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user")
    public ResponseEntity<String> create(@RequestBody @Valid UserDTO userDTO) {
        userSevice.create(userDTO);
        return ResponseEntity.ok("User created successfully");
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        userSevice.delete(id);
        return ResponseEntity.ok("User deleted successfully");
    }

}
