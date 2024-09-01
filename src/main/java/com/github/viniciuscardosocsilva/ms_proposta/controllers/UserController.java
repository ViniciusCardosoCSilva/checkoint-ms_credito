package com.github.viniciuscardosocsilva.ms_proposta.controllers;

import com.github.viniciuscardosocsilva.ms_proposta.dto.UserDTO;
import com.github.viniciuscardosocsilva.ms_proposta.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id).orElseThrow();
    }

    @PostMapping
    public UserDTO insert(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @PutMapping("/{id}")
    public UserDTO update(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        return userService.update(id, userDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
