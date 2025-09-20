package com.example.issue_tracker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "issues")
@Data
public class Issue {
    @Id
    private String id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private String projectId;
    private String assigneeId;
    private String reporterId;
    private List<Comment> comments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
