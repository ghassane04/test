package com.example.demo.Entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Quiz extends GradableItem {
    private int timeLimit;
    private boolean shuffleQuestions;
    private boolean showCorrectAnswers;
}