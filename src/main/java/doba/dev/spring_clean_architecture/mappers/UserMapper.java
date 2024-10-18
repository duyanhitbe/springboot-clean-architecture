package doba.dev.spring_clean_architecture.mappers;

import java.util.List;
import java.util.stream.Collectors;

import doba.dev.spring_clean_architecture.models.user.User;
import doba.dev.spring_clean_architecture.models.user.UserEntity;

public class UserMapper {

    public static User toUser(UserEntity userEntity) {
        return User
                .builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .build();
    }

    public static List<User> toUsers(List<UserEntity> userEntities) {
        return userEntities.stream()
                .map(UserMapper::toUser)
                .collect(Collectors.toList());
    }

}
