package model;


import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity(name="person")
@Data
@RequiredArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private int age;
    @OneToOne (cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Salary salary;

    private Person() {
    }
}
