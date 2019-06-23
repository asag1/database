package lt.codeacademy.taskFromDB.model;

import lombok.*;
import javax.persistence.*;

@Entity(name = "Project_User_Role")
@Data
@RequiredArgsConstructor
public class Project_User_Role {

    private int user_id;

    private int prj_id;

    private int role_description;

}
