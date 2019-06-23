package lt.codeacademy.taskFromDB.model;

import lombok.*;
import javax.persistence.*;

@Entity(name = "Users_Bugs")
@Data
@RequiredArgsConstructor
public class Users_Bugs {

    private int user_id;

    private String role;
}
