package com.abdelkarim.interviewbackend.controller;

import com.abdelkarim.interviewbackend.model.User;
import com.abdelkarim.interviewbackend.service.JobOfferService;
import com.abdelkarim.interviewbackend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/admin")
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

    @GetMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/UpdateUsers")
    public User UpdateUsers(@RequestBody int userId) {
        return userService.updateUsers(userId);
    }

    @GetMapping("/DeleteUser")
    public User DeleteUser(@RequestBody int userId) {
        return userService.DeleteUser(userId);
    }

    @GetMapping("/dashboard")
    public String adminDashboard() {
        return "admin/dashboard";
    }

    @PostMapping("/manage-users")
    public String manageUsers(@RequestParam Long userId) {
        // Admin logic to manage users
        return "redirect:/admin/dashboard";
    }


}
