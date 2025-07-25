package thareesha.career.CareerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thareesha.career.CareerProject.models.Career;


public interface CareerRepository extends JpaRepository<Career, Long> { }