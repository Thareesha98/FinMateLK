package thareesha.career.CareerProject.repository;

import thareesha.career.CareerProject.models.Answer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByUserId(Long userId);
}
