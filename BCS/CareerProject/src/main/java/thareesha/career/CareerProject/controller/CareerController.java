package thareesha.career.CareerProject.controller;

import thareesha.career.CareerProject.models.Career;
import thareesha.career.CareerProject.repository.CareerRepository;
import thareesha.career.CareerProject.services.CareerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/careers")
public class CareerController {
    @Autowired
    private CareerService careerservice;

    @GetMapping
    public List<Career> getAllCareers() {
        return careerservice.getAllCareers();
    }

    @GetMapping("/{id}")
    public Career getCareer(@PathVariable Long id) {
        return careerservice.getCareer(id);
    }

    @PostMapping
    public Career createCareer(@RequestBody Career career) {
        return careerservice.createCareer(career);
    }

    @PutMapping("/{id}")
    public Career updateCareer(@PathVariable Long id, @RequestBody Career career) {
        career.setId(id);
        return careerservice.updateCareer(id, career);
    }

    @DeleteMapping("/{id}")
    public void deleteCareer(@PathVariable Long id) {
        careerservice.deleteCareer(id);
    }
}