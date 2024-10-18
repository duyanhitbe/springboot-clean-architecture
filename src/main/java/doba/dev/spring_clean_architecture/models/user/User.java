package doba.dev.spring_clean_architecture.models.user;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private UUID id;
    private String username;
    private String password;
}
