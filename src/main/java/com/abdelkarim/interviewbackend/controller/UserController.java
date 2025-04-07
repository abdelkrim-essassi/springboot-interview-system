package com.abdelkarim.interviewbackend.controller;


import com.abdelkarim.interviewbackend.model.User;
import com.abdelkarim.interviewbackend.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;  // Inject UserService
    }

}
