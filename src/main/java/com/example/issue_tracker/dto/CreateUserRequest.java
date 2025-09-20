package com.example.issue_tracker.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class CreateUserRequest {
    @NotEmpty()
    private String username;
    @Email
    private String email;
    private List<String> projectIds;
}
