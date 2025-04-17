package com.example.demo.Controllers;

import com.example.demo.Entities.CourseProgress;
import com.example.demo.Services.CourseProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courseProgresses")
public class CourseProgressController {

    @Autowired
    private CourseProgressService courseProgressService;

    @PostMapping
    public CourseProgress createCourseProgress(@RequestBody CourseProgress courseProgress) {
        return courseProgressService.createCourseProgress(courseProgress);
    }

    @GetMapping
    public List<CourseProgress> getAllCourseProgresses() {
        return courseProgressService.getAllCourseProgresses();
    }

    @GetMapping("/{id}")
    public CourseProgress getCourseProgressById(@PathVariable String id) {
        return courseProgressService.getCourseProgressById(id);
    }

    @PutMapping("/{id}")
    public CourseProgress updateCourseProgress(@PathVariable String id, @RequestBody CourseProgress courseProgress) {
        courseProgress.setProgressId(id);
        return courseProgressService.updateCourseProgress(courseProgress);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseProgress(@PathVariable String id) {
        courseProgressService.deleteCourseProgress(id);
    }
}