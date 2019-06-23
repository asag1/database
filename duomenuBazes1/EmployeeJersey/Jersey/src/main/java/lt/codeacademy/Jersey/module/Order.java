package lt.codeacademy.Jersey.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    LocalDateTime orderDate;
    LocalDateTime requiredDate;
    LocalDateTime shippedDate;
    int status;
    String comments;
}
