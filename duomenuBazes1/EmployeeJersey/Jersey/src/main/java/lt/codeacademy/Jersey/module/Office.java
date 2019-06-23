package lt.codeacademy.Jersey.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    private String city;

    private String phone;

    private  String adress1;

    private  String adress2;

    private  String state;

    private  String country;

    private  int postCode;

    private  String territory;
}
