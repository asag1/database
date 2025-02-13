package lt.codeacademy.taskCustomerOnSystem.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import javax.persistence.*;

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public class SuperDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // tells Hibernate that the database provides the primary key value
    private Long id;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}
