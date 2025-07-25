package thareesha.career.CareerProject.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thareesha.career.CareerProject.models.Answer;
import thareesha.career.CareerProject.models.Career;
import thareesha.career.CareerProject.models.CareerRecommendation;
import thareesha.career.CareerProject.repository.AnswerRepository;
import thareesha.career.CareerProject.repository.CareerRecommendationRepository;
import thareesha.career.CareerProject.repository.CareerRepository;



@Service
public class RecommendationService {
	@Autowired
	private CareerRepository careerRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

    @Autowired
    private CareerRecommendationRepository recommendationRepository;
    
    public List<CareerRecommendation> recommendCareersForUser(Long userId){
    	List<Answer> answers = answerRepository.findAll().stream()
    	.filter(a -> a.getUser().getId().equals(userId))
    	.collect(Collectors.toList());
    	
    	List<Career> careers = careerRepository.findAll();
        List<CareerRecommendation> recommendations = new ArrayList<>();
        
        for(Career career: careers) {
        	int score = 0;
            for (Answer answer : answers) {
                // Example: If answer contains a required skill, increase score
                if (career.getSkillsRequired() != null &&
                    answer.getAnswerText() != null &&
                    career.getSkillsRequired().toLowerCase().contains(answer.getAnswerText().toLowerCase())) {
                    score += 10;
                }
            }
            
            if (score > 0) {
                CareerRecommendation rec = new CareerRecommendation();
                rec.setUser(answers.get(0).getUser());
                rec.setCareer(career);
                rec.setScore((double) score);
                recommendations.add(rec);
            }
        }
        
        recommendationRepository.saveAll(recommendations);
        recommendations.sort(Comparator.comparing(CareerRecommendation::getScore).reversed());
        return recommendations;
    }
	
}
