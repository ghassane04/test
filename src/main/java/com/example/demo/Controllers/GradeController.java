package com.example.demo.Controllers;

import com.example.demo.Entities.Grade;
import com.example.demo.Services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @PostMapping
    public Grade createGrade(@RequestBody Grade grade) {
        return gradeService.createGrade(grade);
    }

    @GetMapping
    public List<Grade> getAllGrades() {
        return gradeService.getAllGrades();
    }

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable String id) {
        return gradeService.getGradeById(id);
    }

    @PutMapping("/{id}")
    public Grade updateGrade(@PathVariable String id, @RequestBody Grade grade) {
        grade.setGradeId(id);
        return gradeService.updateGrade(grade);
    }

    @DeleteMapping("/{id}")
    public void deleteGrade(@PathVariable String id) {
        gradeService.deleteGrade(id);
    }
}