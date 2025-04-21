package semicolon.africa.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="users")
public class User {
    @Id
    private String id;

    private String userName;
    private String email;
    private String password;
    private Profile profile;
}
