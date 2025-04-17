package com.example.demo.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class CourseProgress {
    @Id
    private String progressId;
    private Float progressPercentage;
    private Date lastAccessed;
    @ElementCollection
    private List<String> completedMaterials;
}