package lt.codeacademy.Jersey.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    String name;
    int scale;
    String vendor;
    String pdtDescription;
    int qTylnStock;
    double buyPrice;
    String MSRP;
}
