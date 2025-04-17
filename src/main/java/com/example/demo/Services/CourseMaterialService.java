package com.example.demo.Services;

import com.example.demo.Entities.CourseMaterial;
import com.example.demo.Repositories.CourseMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseMaterialService {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    public CourseMaterial createCourseMaterial(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }

    public List<CourseMaterial> getAllCourseMaterials() {
        return courseMaterialRepository.findAll();
    }

    public CourseMaterial getCourseMaterialById(String id) {
        return courseMaterialRepository.findById(id).orElse(null);
    }

    public CourseMaterial updateCourseMaterial(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }

    public void deleteCourseMaterial(String id) {
        courseMaterialRepository.deleteById(id);
    }
}