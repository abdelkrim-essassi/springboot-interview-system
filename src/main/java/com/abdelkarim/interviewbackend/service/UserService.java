package com.abdelkarim.interviewbackend.service;

import com.abdelkarim.interviewbackend.dto.UserDTO;
import com.abdelkarim.interviewbackend.model.User;
import com.abdelkarim.interviewbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(), user.getFirstName(),user.getLastName(), user.getEmail(), user.getRole());
    }


    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public UserDTO createUser(User userDTO) {
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword("hashed_password");
        userRepository.save(user);
        return convertToDTO(user);
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        return convertToDTO(user);
    }


    public boolean deleteUser(Long id) {
            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
                return true;
            }
            return false;
        }

    public boolean updateUser(long id, User user) {
        // Compliting it later (ask mr)
        return true;
    }

    }
