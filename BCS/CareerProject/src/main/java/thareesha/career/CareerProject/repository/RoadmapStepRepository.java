package thareesha.career.CareerProject.repository;
import thareesha.career.CareerProject.models.RoadmapStep;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoadmapStepRepository extends JpaRepository<RoadmapStep, Long> {
    List<RoadmapStep> findByCareerIdOrderByStepNumber(Long careerId);
}