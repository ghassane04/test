package com.example.demo.Entities;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
public class Enrollment {
    @Id
    private String enrollmentId;
    private Date enrollmentDate;

    public enum EnrollmentStatus {
        ACTIVE, DROPPED, COMPLETED
    }

    private EnrollmentStatus status;
}