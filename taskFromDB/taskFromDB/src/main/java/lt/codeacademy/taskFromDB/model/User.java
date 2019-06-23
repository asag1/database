package lt.codeacademy.taskFromDB.model;

import lombok.*;
import javax.persistence.*;

@Entity(name = "User")
@Data
@RequiredArgsConstructor
public class User {

    private int user_id;

    private int role_description;
}
