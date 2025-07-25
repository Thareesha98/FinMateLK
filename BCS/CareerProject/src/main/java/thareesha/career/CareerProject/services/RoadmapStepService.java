package thareesha.career.CareerProject.services;


import thareesha.career.CareerProject.models.RoadmapStep;
import thareesha.career.CareerProject.repository.RoadmapStepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadmapStepService {
    @Autowired
    private RoadmapStepRepository roadmapStepRepository;

    public List<RoadmapStep> getAllRoadmapSteps() {
        return roadmapStepRepository.findAll();
    }

    public List<RoadmapStep> getStepsForCareer(Long careerId) {
        return roadmapStepRepository.findByCareerIdOrderByStepNumber(careerId);
    }

    public RoadmapStep createRoadmapStep(RoadmapStep roadmapStep) {
        return roadmapStepRepository.save(roadmapStep);
    }

    public RoadmapStep updateRoadmapStep(Long id, RoadmapStep roadmapStep) {
        roadmapStep.setId(id);
        return roadmapStepRepository.save(roadmapStep);
    }

    public void deleteRoadmapStep(Long id) {
        roadmapStepRepository.deleteById(id);
    }
}