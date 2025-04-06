package com.abdelkarim.interviewbackend.service;

import com.abdelkarim.interviewbackend.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>(Arrays.asList());

    public User getUserById(int userId) {
        return users.stream()
                .filter(u -> u.getId() == userId)
                .findFirst()
                .orElse(null);
    }

    public User DeleteUser(int userId) {
        return null;
    }
}
