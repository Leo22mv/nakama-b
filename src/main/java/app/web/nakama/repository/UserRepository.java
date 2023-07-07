package app.web.nakama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.web.nakama.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
