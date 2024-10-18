package doba.dev.spring_clean_architecture.usecases.user;

import java.util.List;

import doba.dev.spring_clean_architecture.models.user.User;
import doba.dev.spring_clean_architecture.repositories.user.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindAllUserUsecase {

    final UserRepository userRepository;

    public List<User> execute() {
        return userRepository.findAll();
    }
}
