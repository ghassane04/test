package com.example.demo.Services;

import com.example.demo.Entities.Submission;
import com.example.demo.Repositories.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;

    public Submission createSubmission(Submission submission) {
        return submissionRepository.save(submission);
    }

    public Submission getSubmissionById(String id) {
        return submissionRepository.findById(id).orElse(null);
    }

    public List<Submission> getAllSubmissions() {
        return submissionRepository.findAll();
    }

    public Submission updateSubmission(Submission submission) {
        return submissionRepository.save(submission);
    }

    public void deleteSubmission(String id) {
        submissionRepository.deleteById(id);
    }
}