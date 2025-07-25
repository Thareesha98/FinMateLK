package thareesha.career.CareerProject.controller;


import thareesha.career.CareerProject.models.CareerRecommendation;
import thareesha.career.CareerProject.services.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommend")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/user/{userId}")
    public List<CareerRecommendation> getRecommendations(@PathVariable Long userId) {
        return recommendationService.recommendCareersForUser(userId);
    }
}