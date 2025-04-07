package com.abdelkarim.interviewbackend.service;

import com.abdelkarim.interviewbackend.dto.UserDTO;
import com.abdelkarim.interviewbackend.model.User;
import com.abdelkarim.interviewbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(), user.getFirstName(),user.getLastName(), user.getEmail());
    }


    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public User getUserById(Long userId) {
        User user = userRepository.getReferenceById(userId);
        return user;

    }

        public boolean deleteUser(Long id) {
            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
                return true;
            }
            return false;
        }

    public boolean updateUser(long id, User user) {
        // Compliting it later
        return true;
    }

        public User addUser(User user) {
        // Compliting it later..
            return null;
        }
    }
