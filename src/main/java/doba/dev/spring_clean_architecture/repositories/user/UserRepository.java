package doba.dev.spring_clean_architecture.repositories.user;

import java.util.List;

import doba.dev.spring_clean_architecture.models.user.User;

public interface UserRepository {
    User create(String username, String password);
    List<User> findAll();
}
