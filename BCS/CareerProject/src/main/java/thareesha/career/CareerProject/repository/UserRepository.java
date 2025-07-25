package thareesha.career.CareerProject.repository;

import java.util.Optional;

import thareesha.career.CareerProject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
