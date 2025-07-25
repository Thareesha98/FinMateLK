package thareesha.career.CareerProject.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import thareesha.career.CareerProject.repository.RoadmapStepRepository;
import thareesha.career.CareerProject.models.RoadmapStep;

import java.util.List;

@RestController
@RequestMapping("/api/roadmap-steps")
public class RoadmapStepController {
    @Autowired
    private RoadmapStepRepository roadmapStepRepository;

    @GetMapping
    public List<RoadmapStep> getAllRoadmapSteps() {
        return roadmapStepRepository.findAll();
    }

    @GetMapping("/career/{careerId}")
    public List<RoadmapStep> getStepsForCareer(@PathVariable Long careerId) {
        return roadmapStepRepository.findByCareerIdOrderByStepNumber(careerId);
    }

    @PostMapping
    public RoadmapStep createRoadmapStep(@RequestBody RoadmapStep roadmapStep) {
        return roadmapStepRepository.save(roadmapStep);
    }

    @PutMapping("/{id}")
    public RoadmapStep updateRoadmapStep(@PathVariable Long id, @RequestBody RoadmapStep roadmapStep) {
        roadmapStep.setId(id);
        return roadmapStepRepository.save(roadmapStep);
    }

    @DeleteMapping("/{id}")
    public void deleteRoadmapStep(@PathVariable Long id) {
        roadmapStepRepository.deleteById(id);
    }
}