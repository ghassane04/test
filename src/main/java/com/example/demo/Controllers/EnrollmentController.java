package com.example.demo.Controllers;

import com.example.demo.Entities.Enrollment;
import com.example.demo.Services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.createEnrollment(enrollment);
    }

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    @GetMapping("/{id}")
    public Enrollment getEnrollmentById(@PathVariable String id) {
        return enrollmentService.getEnrollmentById(id);
    }

    @PutMapping("/{id}")
    public Enrollment updateEnrollment(@PathVariable String id, @RequestBody Enrollment enrollment) {
        enrollment.setEnrollmentId(id);
        return enrollmentService.updateEnrollment(enrollment);
    }

    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable String id) {
        enrollmentService.deleteEnrollment(id);
    }
}