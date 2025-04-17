package com.example.demo.Entities;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
public class Submission {
    @Id
    private String submissionId;
    private String content;
    private Date submissionDate;

    public enum Status {
        DRAFT, SUBMITTED, LATE
    }

    private Status status;
}