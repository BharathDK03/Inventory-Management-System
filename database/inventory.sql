CREATE DATABASE inventory;

USE inventory;

CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100),
    stock INT,
    max_stock INT,
    supplier VARCHAR(100)
);

INSERT INTO products(product_name, stock, max_stock, supplier)
VALUES
('Laptop',10,10,'Dell Supplier'),
('Mouse',50,50,'HP Supplier'),
('Keyboard',30,30,'Logitech Supplier');