package com.abdelkarim.interviewbackend.controller;

import com.abdelkarim.interviewbackend.model.User;
import com.abdelkarim.interviewbackend.service.JobOfferService;
import com.abdelkarim.interviewbackend.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/admin")
@RestController
public class AdminController {
    private final UserService userService;
    private final JobOfferService jobOfferService;

    public AdminController(UserService userService, JobOfferService jobOfferService) {
        this.userService = userService;
        this.jobOfferService = jobOfferService;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/users/{userId}")
    public User DeleteUser(@PathVariable int userId) {
        return userService.DeleteUser(userId);
    }


}
