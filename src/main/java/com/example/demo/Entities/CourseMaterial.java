package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CourseMaterial {
    @Id
    private String materialId;
    private String title;
    private String type;
    private String content;
    private Date uploadDate;
    private Date availableFrom;
    private Date availableTo;
}