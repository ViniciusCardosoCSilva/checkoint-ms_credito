package com.github.viniciuscardosocsilva.ms_proposta.services;

import com.github.viniciuscardosocsilva.ms_proposta.dto.UserDTO;
import com.github.viniciuscardosocsilva.ms_proposta.model.User;
import com.github.viniciuscardosocsilva.ms_proposta.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<UserDTO> findById(Long id) {
        return userRepository.findById(id).map(this::convertToDTO);
    }

    public UserDTO save(UserDTO userDTO) {
        User user = convertToEntity(userDTO);
        return convertToDTO(userRepository.save(user));
    }

    public UserDTO update(Long id, UserDTO userDTO) {
        User user = userRepository.findById(id).orElseThrow();
        user.setNome(userDTO.getNome());
        user.setEmail(userDTO.getEmail());
        user.setCpf(userDTO.getCpf());
        user.setTelefone(userDTO.getTelefone());
        return convertToDTO(userRepository.save(user));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setNome(user.getNome());
        dto.setEmail(user.getEmail());
        dto.setCpf(user.getCpf());
        dto.setTelefone(user.getTelefone());
        return dto;
    }

    private User convertToEntity(UserDTO dto) {
        User user = new User();
        user.setNome(dto.getNome());
        user.setEmail(dto.getEmail());
        user.setCpf(dto.getCpf());
        user.setTelefone(dto.getTelefone());
        return user;
    }
}
