package thareesha.career.CareerProject.repository;


import thareesha.career.CareerProject.models.CareerRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CareerRecommendationRepository extends JpaRepository<CareerRecommendation, Long> {
    List<CareerRecommendation> findByUserId(Long userId);
}