package lt.codeacademy.Jersey.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    String firstName;

    String lastName;

    String name;

    String phone;

    String adress1;

    String adress2;

    String state;

    String country;

    int postCode;

    double creditLimit;
    }
