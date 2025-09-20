package com.example.issue_tracker.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    private String id;
    private String username;
    private String email;
    private List<String> projectIds;
}
