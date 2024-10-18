package doba.dev.spring_clean_architecture.dto.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserRequest {
    private String username;
    private String password;
}
