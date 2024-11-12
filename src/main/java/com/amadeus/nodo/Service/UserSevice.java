package com.amadeus.nodo.Service;

import com.amadeus.nodo.Contracts.UserDTO;
import com.amadeus.nodo.Models.UserEntity;
import com.amadeus.nodo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserSevice {

    @Autowired
    private UserRepository userRepository;

    public void create(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userDTO.getName());
        userEntity.setEmail(userDTO.getEmail());
        userRepository.save(userEntity);
        System.out.println("El usuario ha sido creado con exito");
    }

    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(user -> {
            UserDTO userDTO = new UserDTO();
            userDTO.setName(user.getName());
            userDTO.setEmail(user.getEmail());
            return userDTO;
        }).collect(Collectors.toList());
    }

    public Optional<UserDTO> findById(int id) {
        Optional<UserEntity> userEntity = userRepository.findById(id);
        UserDTO userDTO = new UserDTO();
        userDTO.setName(userEntity.get().getName());
        userDTO.setEmail(userEntity.get().getEmail());
        return Optional.of(userDTO);
    }

    public String delete(int id) {
        userRepository.deleteById(id);
        return "La persona con ID: " + id + " ha sido eliminada";
    }

}
