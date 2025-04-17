package com.example.demo.Entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Teacher extends User {
    private String teacherId;

    public void createCourse() {
        // Implementation for creating a course
    }

    public void gradeAssignment() {
        // Implementation for grading an assignment
    }

    public void generateReport() {
        // Implementation for generating a report
    }
}