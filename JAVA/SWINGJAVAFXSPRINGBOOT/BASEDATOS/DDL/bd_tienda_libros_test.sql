CREATE DATABASE tienda_libros_test;

USE tienda_libros_test;

CREATE TABLE libro
(
    libro_id   INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre     VARCHAR(50)     NOT NULL,
    autor      VARCHAR(50)     NOT NULL,
    precio     DECIMAL(10, 2)  NOT NULL,
    existencia INT             NOT NULL,
    estado     TINYINT         NOT NULL
);

