package lt.codeacademy.Jersey.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private String extension;

    private String email;

    private String jobTitle;
    @JoinColumn(name = "officeID", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_Office_Employee")
            private Office office;

            @ManyToOne(cascade = CascadeType.ALL)
            @JoinColumn(name = "reportsTO", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_reportsto_eployee"), nullable = true)
    private Employee employee;
}
