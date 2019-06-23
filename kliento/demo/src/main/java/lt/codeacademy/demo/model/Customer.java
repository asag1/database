package lt.codeacademy.demo.model;

import lombok.Data;
import org.hibernate.annotations.Formula;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
//@Table (name = "customer", uniqueConstraints = @UniqueConstraint
//        (name="customer_type", columnNames = {"name", "surname", "birthDay"})
//indexes = @Index(name= "customer_customer_type_idx", columnList = "custumer_type_id", unique = false)
//)
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotNull
//    @Column(length = 30)
//    private String name;
////
//    @NotNull
//    @Column (length = 50)
//    private String surname;
//
//    @Column (nullable = false, length = 8)
//    private String mobileNumber;
//
//    @Column(nullable = false)
//    private LocalDate birthDate;
//
//    @Formula(value = "data_part('year', age(birthDate))")
//    private int age;

//    private CustumerType custumerType;
}
