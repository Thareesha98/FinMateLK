package thareesha.career.CareerProject.services;


import thareesha.career.CareerProject.models.Career;
import thareesha.career.CareerProject.repository.CareerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerService {
    @Autowired
    private CareerRepository careerRepository;

    public List<Career> getAllCareers() {
        return careerRepository.findAll();
    }

    public Career getCareer(Long id) {
        return careerRepository.findById(id).orElse(null);
    }

    public Career createCareer(Career career) {
        return careerRepository.save(career);
    }

    public Career updateCareer(Long id, Career career) {
        career.setId(id);
        return careerRepository.save(career);
    }

    public void deleteCareer(Long id) {
        careerRepository.deleteById(id);
    }
}