package lt.codeacademy.Jersey.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order_Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    int qty;
    double priceEach;
}
