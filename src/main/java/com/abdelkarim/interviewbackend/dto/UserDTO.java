package com.abdelkarim.interviewbackend.dto;

import com.abdelkarim.interviewbackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private User.Role role;
}
