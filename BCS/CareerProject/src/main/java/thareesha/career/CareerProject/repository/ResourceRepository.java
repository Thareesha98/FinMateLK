package thareesha.career.CareerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thareesha.career.CareerProject.models.Resource;

import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findByCareerId(Long careerId);
}

