package doba.dev.spring_clean_architecture.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import doba.dev.spring_clean_architecture.dto.user.CreateUserRequest;
import doba.dev.spring_clean_architecture.models.user.User;
import doba.dev.spring_clean_architecture.usecases.user.CreateUserUsecase;
import doba.dev.spring_clean_architecture.usecases.user.FindAllUserUsecase;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(name="user")
@RequiredArgsConstructor
public class UserController {
    final CreateUserUsecase createUserUsecase;
    final FindAllUserUsecase findAllUserUsecase;

    @PostMapping
    public User createUser(@RequestBody CreateUserRequest request) {
        return createUserUsecase.execute(request.getUsername(), request.getPassword());
    }

    @GetMapping
    public List<User> findAllUser() {
        return findAllUserUsecase.execute();
    }
}
