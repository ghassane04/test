package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Question {
    @Id
    private String questionId;
    private String text;
    private float points;

    public enum QuestionType {
        MULTIPLE_CHOICE, TRUE_FALSE, MULTI_SELECT
    }

    @Enumerated(EnumType.STRING)
    private QuestionType questionType;
    private String explanation;
}