package com.example.issue_tracker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "activityLogs")
@Data
public class ActivityLog {
    @Id
    private String id;
    private String issueId;
    private String action; // e.g., "created", "updated", "commented"
    private String performedBy;
    private LocalDateTime timestamp;
}
