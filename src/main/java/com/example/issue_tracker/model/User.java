package com.example.issue_tracker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
@Data
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private List<String> projectIds;
}
