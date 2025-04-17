package com.example.demo.Services;

import com.example.demo.Entities.CourseProgress;
import com.example.demo.Repositories.CourseProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseProgressService {

    @Autowired
    private CourseProgressRepository courseProgressRepository;

    public CourseProgress createCourseProgress(CourseProgress courseProgress) {
        return courseProgressRepository.save(courseProgress);
    }

    public List<CourseProgress> getAllCourseProgresses() {
        return courseProgressRepository.findAll();
    }

    public CourseProgress getCourseProgressById(String id) {
        return courseProgressRepository.findById(id).orElse(null);
    }

    public CourseProgress updateCourseProgress(CourseProgress courseProgress) {
        return courseProgressRepository.save(courseProgress);
    }

    public void deleteCourseProgress(String id) {
        courseProgressRepository.deleteById(id);
    }
}