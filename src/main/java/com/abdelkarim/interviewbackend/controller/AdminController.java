package com.abdelkarim.interviewbackend.controller;

import com.abdelkarim.interviewbackend.model.User;
import com.abdelkarim.interviewbackend.service.JobOfferService;
import com.abdelkarim.interviewbackend.service.UserService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/admin")
@RestController
public class AdminController {
    private UserService userService;
    private JobOfferService jobOfferService;

    public AdminController(UserService userService, JobOfferService jobOfferService) {
        this.userService = userService;
        this.jobOfferService = jobOfferService;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }


    @GetMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        User savedUser = userService.addUser(user);

        if (savedUser != null) {
            return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to add user", HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("/UpdateUser/{id}")
    public ResponseEntity<String> updateUser(@RequestBody int id, @RequestBody User user) {
        boolean isUpdated = userService.updateUser(id,user);

        if (isUpdated) {
            return new ResponseEntity<>( "User Updated Successfully", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/DeleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        boolean isDeleted = userService.deleteUser(id);

        if (isDeleted) {
            return new ResponseEntity<>("User deleted successfully", HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
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
