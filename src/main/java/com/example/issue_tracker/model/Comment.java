package com.example.issue_tracker.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private String userId;
    private String message;
    private LocalDateTime createdAt;
}
