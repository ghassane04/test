package com.example.demo.Entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Student extends User {
    private String studentId;

    public void joinCourse() {
        // Implementation
    }

    public void submitAssignment() {
        // Implementation
    }

    public void viewGrades() {
        // Implementation
    }
}