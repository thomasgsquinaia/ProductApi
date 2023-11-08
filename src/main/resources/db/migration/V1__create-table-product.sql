CREATE TABLE product (
    id SERIAL
    CONSTRAINT product_pkey
    PRIMARY KEY UNIQUE NOT NULL,
    name TEXT NOT NULL,
    price FLOAT NOT NULL
);