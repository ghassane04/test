package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Answer {
    @Id
    private String answerId;
    private String text;
    private boolean isCorrect;
    private int order;
}