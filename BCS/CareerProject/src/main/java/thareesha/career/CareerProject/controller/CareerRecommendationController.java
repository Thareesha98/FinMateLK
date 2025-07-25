package thareesha.career.CareerProject.controller;

import thareesha.career.CareerProject.models.CareerRecommendation;
import thareesha.career.CareerProject.repository.CareerRecommendationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class CareerRecommendationController {
    @Autowired
    private CareerRecommendationRepository recommendationRepository;

    @GetMapping("/user/{userId}")
    public List<CareerRecommendation> getRecommendationsForUser(@PathVariable Long userId) {
        return recommendationRepository.findByUserId(userId);
    }

    @PostMapping
    public CareerRecommendation createRecommendation(@RequestBody CareerRecommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }

    @DeleteMapping("/{id}")
    public void deleteRecommendation(@PathVariable Long id) {
        recommendationRepository.deleteById(id);
    }
}