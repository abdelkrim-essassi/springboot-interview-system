package com.abdelkarim.interviewbackend.controller;

import com.abdelkarim.interviewbackend.dto.UserDTO;
import com.abdelkarim.interviewbackend.model.User;
import com.abdelkarim.interviewbackend.service.JobOfferService;
import com.abdelkarim.interviewbackend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/admin")
@RestController
public class AdminController {
    private final UserService userService;
    private JobOfferService jobOfferService;


    public AdminController(UserService userService, JobOfferService jobOfferService) {
        this.userService = userService;
        this.jobOfferService = jobOfferService;
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


    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/users/{userId}")
    public UserDTO getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }


    @GetMapping("/addUser")
    public String createUser(@RequestBody User user) {
        UserDTO savedUser = userService.createUser(user);

        if (savedUser != null) {
            return("User added successfully");
        } else {
            return("Failed to add user");
        }
    }

    @GetMapping("/UpdateUser/{id}")
    public String updateUser(@RequestBody Long id, @RequestBody User user) {
        boolean isUpdated = userService.updateUser(id,user);

        if (isUpdated) {
            return("User Updated Successfully");
        }
        else {
            return("User Not Found");
        }

    }

    @DeleteMapping("/DeleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        boolean isDeleted = userService.deleteUser(id);

        if (isDeleted) {
            return ("User deleted successfully");
        } else {
            return("User Not Found");
        }
    }


}
