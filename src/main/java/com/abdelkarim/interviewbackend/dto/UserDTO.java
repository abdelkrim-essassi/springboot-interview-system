package com.abdelkarim.interviewbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {
    private int id;
    private String firstName;
    private String email;
    private String role;
}
