package model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@RequiredArgsConstructor
@Entity
public class Salary {

    @Id
    @Column(name = "person_id")
    private Long id;

    @NonNull
    private int pay;

    private Salary() {
    }
}
