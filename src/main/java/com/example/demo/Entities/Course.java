package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Course {
    @Id
    private String courseId;
    private String courseCode;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;

    public Course() {
        this.courseId = UUID.randomUUID().toString();
    }

    public String generateJoinCode() {
        // Implement your join code generation logic here
        return "JOIN-" + this.courseCode + "-" + UUID.randomUUID().toString().substring(0, 6);
    }
}