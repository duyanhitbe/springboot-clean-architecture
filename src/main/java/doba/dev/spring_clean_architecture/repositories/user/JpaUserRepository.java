package doba.dev.spring_clean_architecture.repositories.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import doba.dev.spring_clean_architecture.models.user.UserEntity;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, UUID> {
    
}
