package com.abdelkarim.interviewbackend.service;

import com.abdelkarim.interviewbackend.model.User;
import com.abdelkarim.interviewbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User getUserById(int userId) {
        return userRepository.

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
