package com.example.demo.Controllers;

import com.example.demo.Entities.Assignment;
import com.example.demo.Services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping
    public Assignment createAssignment(@RequestBody Assignment assignment) {
        return assignmentService.createAssignment(assignment);
    }

    @GetMapping
    public List<Assignment> getAllAssignments() {
        return assignmentService.getAllAssignments();
    }

    @GetMapping("/{id}")
    public Assignment getAssignmentById(@PathVariable String id) {
        return assignmentService.getAssignmentById(id);
    }

    @PutMapping("/{id}")
    public Assignment updateAssignment(@PathVariable String id, @RequestBody Assignment assignment) {
        assignment.setItemId(id);
        return assignmentService.updateAssignment(assignment);
    }

    @DeleteMapping("/{id}")
    public void deleteAssignment(@PathVariable String id) {
        assignmentService.deleteAssignment(id);
    }
}