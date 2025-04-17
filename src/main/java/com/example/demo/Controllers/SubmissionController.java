package com.example.demo.Controllers;

import com.example.demo.Entities.Submission;
import com.example.demo.Services.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/submissions")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping
    public Submission createSubmission(@RequestBody Submission submission) {
        return submissionService.createSubmission(submission);
    }

    @GetMapping
    public List<Submission> getAllSubmissions() {
        return submissionService.getAllSubmissions();
    }

    @GetMapping("/{id}")
    public Submission getSubmissionById(@PathVariable String id) {
        return submissionService.getSubmissionById(id);
    }

    @PutMapping("/{id}")
    public Submission updateSubmission(@PathVariable String id, @RequestBody Submission submission) {
        submission.setSubmissionId(id);
        return submissionService.updateSubmission(submission);
    }

    @DeleteMapping("/{id}")
    public void deleteSubmission(@PathVariable String id) {
        submissionService.deleteSubmission(id);
    }
}