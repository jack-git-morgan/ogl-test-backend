CREATE TABLE customer (
    id    bigint GENERATED BY DEFAULT AS IDENTITY,
    name varchar(255) NOT NULL,
    street VARCHAR(255),
    city VARCHAR(255),
    county VARCHAR(255),
    postcode VARCHAR(32),
    PRIMARY KEY (id)
);
CREATE TABLE product (
    id    bigint GENERATED BY DEFAULT AS IDENTITY,
    price decimal(19, 2) NOT NULL,
    sku   varchar(255),
    description VARCHAR(255) NOT NULL, 
    PRIMARY KEY (id)
);

ALTER TABLE product
    ADD CONSTRAINT UK_q1mafxn973ldq80m1irp3mpvq UNIQUE (sku);
