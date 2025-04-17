package com.example.demo.Entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Assignment extends GradableItem {
    private String submissionType;
    private String instructions;
}