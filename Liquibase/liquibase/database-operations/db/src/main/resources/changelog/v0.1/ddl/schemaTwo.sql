--liquibase formatted sql

--changeset pavel.vrublevskij:creat_customer_table dbms:mysql
CREATE TABLE customers (
    id INT(11) NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(40) NULL DEFAULT NULL,
    mi VARCHAR(1) NULL DEFAULT NULL,
    last_name VARCHAR(40) NULL DEFAULT NULL,
    street VARCHAR(20) NULL DEFAULT NULL,
    city VARCHAR(20) NULL DEFAULT NULL,
    state VARCHAR(2) NULL DEFAULT NULL,
    zip INT(5) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB
AUTO_INCREMENT=7
;
--rollback DROP TABLE IF EXISTS customers;

