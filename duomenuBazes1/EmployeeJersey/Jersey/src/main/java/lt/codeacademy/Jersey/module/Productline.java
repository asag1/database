package lt.codeacademy.Jersey.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    String descInText;
    String descInHTML;
    String image;
}
