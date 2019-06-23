package lt.codeacademy.taskFromDB.model;


import lombok.*;
import javax.persistence.*;

@Entity(name = "Workflow")
@Data
@RequiredArgsConstructor
public class Workflow {

    private int wf_id;

    private String wf_name;
}
