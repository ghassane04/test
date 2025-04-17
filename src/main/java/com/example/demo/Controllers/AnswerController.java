package com.example.demo.Controllers;

import com.example.demo.Entities.Answer;
import com.example.demo.Services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping
    public Answer createAnswer(@RequestBody Answer answer) {
        return answerService.createAnswer(answer);
    }

    @GetMapping
    public List<Answer> getAllAnswers() {
        return answerService.getAllAnswers();
    }

    @GetMapping("/{id}")
    public Answer getAnswerById(@PathVariable String id) {
        return answerService.getAnswerById(id);
    }

    @PutMapping("/{id}")
    public Answer updateAnswer(@PathVariable String id, @RequestBody Answer answer) {
        answer.setAnswerId(id);
        return answerService.updateAnswer(answer);
    }

    @DeleteMapping("/{id}")
    public void deleteAnswer(@PathVariable String id) {
        answerService.deleteAnswer(id);
    }
}