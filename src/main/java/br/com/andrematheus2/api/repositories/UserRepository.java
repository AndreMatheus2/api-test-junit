package br.com.andrematheus2.api.repositories;

import br.com.andrematheus2.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findyByEmail(String email);
}