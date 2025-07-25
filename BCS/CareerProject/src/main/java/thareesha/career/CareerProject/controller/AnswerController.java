package thareesha.career.CareerProject.controller;

import thareesha.career.CareerProject.models.Answer;
import thareesha.career.CareerProject.repository.AnswerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {
    @Autowired
    private AnswerRepository answerRepository;

    @GetMapping
    public List<Answer> getAllAnswers() {
        return answerRepository.findAll();
    }

    @PostMapping
    public Answer createAnswer(@RequestBody Answer answer) {
        return answerRepository.save(answer);
    }

    @DeleteMapping("/{id}")
    public void deleteAnswer(@PathVariable Long id) {
        answerRepository.deleteById(id);
    }
}


