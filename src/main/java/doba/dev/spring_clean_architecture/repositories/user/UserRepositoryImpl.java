package doba.dev.spring_clean_architecture.repositories.user;

import java.util.List;

import doba.dev.spring_clean_architecture.mappers.UserMapper;
import doba.dev.spring_clean_architecture.models.user.User;
import doba.dev.spring_clean_architecture.models.user.UserEntity;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    JpaUserRepository jpaUserRepository;

    @Override
    public User create(String username, String password) {
        UserEntity user = jpaUserRepository.save(
                UserEntity
                        .builder()
                        .username(username)
                        .password(password)
                        .build()
        );

        return UserMapper.toUser(user);
    }

    @Override
    public List<User> findAll() {
        List<UserEntity> userEntities = jpaUserRepository.findAll();

        return UserMapper.toUsers(userEntities);
    }
    
}
