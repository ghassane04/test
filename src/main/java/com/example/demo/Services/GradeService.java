package com.example.demo.Services;

import com.example.demo.Entities.Grade;
import com.example.demo.Repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public Grade createGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    public Optional<Grade> getGradeById(String id) {
        return gradeRepository.findById(id);
    }

    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    public Grade updateGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    public void deleteGrade(String id) {
        gradeRepository.deleteById(id);
    }
}