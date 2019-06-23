package lt.codeacademy.taskFromDB.model;

import lombok.*;
import javax.persistence.*;

@Entity (name = "Project")
@Data
@RequiredArgsConstructor
public class Project {

private int prj_id;

private int wf_id;
}
