package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Grade {
    @Id
    private String gradeId;
    private Float score;
    private String feedback;
    private Date gradedDate;
}