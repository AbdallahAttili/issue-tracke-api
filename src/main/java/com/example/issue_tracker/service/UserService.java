package com.example.issue_tracker.service;

import com.example.issue_tracker.dto.CreateUserRequest;
import com.example.issue_tracker.dto.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> getAll();

    UserResponse createUser(CreateUserRequest userRequest);

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);
}
