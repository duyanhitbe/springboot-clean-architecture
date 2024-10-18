package doba.dev.spring_clean_architecture.usecases.user;

import doba.dev.spring_clean_architecture.models.user.User;
import doba.dev.spring_clean_architecture.repositories.user.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUserUsecase {
    final UserRepository userRepository;

    public User execute(String username, String password) {
        return userRepository.create(username, password);
    }
}
