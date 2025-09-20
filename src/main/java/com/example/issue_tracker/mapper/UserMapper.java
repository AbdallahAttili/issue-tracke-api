package com.example.issue_tracker.mapper;

import com.example.issue_tracker.dto.CreateUserRequest;
import com.example.issue_tracker.dto.UserResponse;
import com.example.issue_tracker.model.User;




public interface UserMapper {
    User fromDto(CreateUserRequest dto);
    UserResponse toDto(User user);
}

